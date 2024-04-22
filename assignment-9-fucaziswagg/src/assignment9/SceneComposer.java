package assignment9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import assignment9.scenes.Bubbles;
import assignment9.scenes.Clear;
import assignment9.scenes.Forest;
import assignment9.scenes.Leaves;
import assignment9.scenes.Line;
import assignment9.scenes.Poly;
import assignment9.scenes.Sequence;
import assignment9.scenes.ifs.Dragon;
import assignment9.scenes.ifs.Tree;
import edu.princeton.cs.introcs.StdDraw;
import support.cse131.ArgsProcessor;

public class SceneComposer {



	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);
		
		// Note: Double Buffering is enabled!  
		//       You'll need to call show() to update the screen.
		//       In most cases you'll want to call show() after you've drawn something
		StdDraw.enableDoubleBuffering();
		
		
		//
		// for demo only, remove this code and write your own to do what
		//   is needed for this assignment
		HashMap <String, Drawable> composer = new HashMap<>();
		
		//the Bubbles
		Bubbles b1 = new Bubbles(25);
		Bubbles b2 = new Bubbles(50);
		Bubbles b3 = new Bubbles(75);
		Bubbles b4 = new Bubbles(100);
		Bubbles b5 = new Bubbles(150);
		composer.put("b1", b1);
		composer.put("b2", b2);
		composer.put("b3", b3);
		composer.put("b4", b4);
		composer.put("b5", b5);
		
		//clear
		Clear c = new Clear();
		composer.put("clear", c);
		
		//dragons
		Dragon upperR = new Dragon(.5, .5, .5);
		Dragon bigMiddle = new Dragon(0,0,1);
		Dragon lowerL = new Dragon(0, 0, .5);
		Dragon upperL = new Dragon(0,.5,.5);
		Dragon lowerR = new Dragon(.5,0,.5);
		Dragon middle = new Dragon(.25, .25, .5);
		composer.put("d1", bigMiddle);
		composer.put("d2", middle);
		composer.put("d3", upperL);
		composer.put("d4", upperR);
		composer.put("d5", lowerL);
		composer.put("d5", lowerR);
		
		//forests
		Forest f1 = new Forest(50);
		Forest f2 = new Forest(75);
		Forest f3 = new Forest(100);
		Forest f4 = new Forest(200);
		Forest f5 = new Forest(300);
		composer.put("f1", f1);
		composer.put("f2", f2);
		composer.put("f3", f3);
		composer.put("f4", f4);
		composer.put("f5", f5);
		
		//trees, polygons, leafs, lines
		//leaves
		Leaves le1 = new Leaves(25);
		Leaves le2 = new Leaves(50);
		Leaves le3 = new Leaves(75);
		Leaves le4 = new Leaves(100);
		Leaves le5 = new Leaves(10);
		composer.put("le1", le1);
		composer.put("le2", le2);
		composer.put("le3", le3);
		composer.put("le4", le4);
		composer.put("le5", le5);
		
		//lines
		Line li1 = new Line();
		Line li2 = new Line();
		Line li3 = new Line();
		Line li4 = new Line();
		Line li5 = new Line();
		composer.put("li1", li1);
		composer.put("li2", li2);
		composer.put("li3", li3);
		composer.put("li4", li4);
		composer.put("li5", li5);
		
		//polygons
		Poly p1 = new Poly(3);
		Poly p2 = new Poly(5);
		Poly p3 = new Poly(7);
		Poly p4 = new Poly(10);
		Poly p5 = new Poly(15);
		composer.put("p1", p1);
		composer.put("p2", p2);
		composer.put("p3", p3);
		composer.put("p4", p4);
		composer.put("p5", p5);
		
		//trees
		Tree t1 = new Tree(0,0,1);
		Tree t2 = new Tree(0,0, .25);
		Tree t3 = new Tree(.5, .5, .25);
		Tree t4 = new Tree(0, .5, .25);
		Tree t5 = new Tree(.5, 0, .25);
		composer.put("t1", t1);
		composer.put("t2", t2);
		composer.put("t3", t3);
		composer.put("t4", t4);
		composer.put("t5", t5);
		
		//initial
		List <Drawable> initList = new LinkedList <Drawable>();
		initList.add(t3);
		initList.add(t3);
		initList.add(t3);
		initList.add(p1);
		initList.add(p4);
		initList.add(f2);
		initList.add(f2);
		initList.add(middle);
		initList.add(middle);
		initList.add(middle);
		initList.add(middle);
		initList.add(b5);
		initList.add(f1);
		initList.add(li1);
		initList.add(li5);
		initList.add(li5);
		//showing initial drawing
		Sequence initSeq = new Sequence(initList);
		composer.put("init", initSeq);
		StdDraw.show();
		initSeq.draw();
		StdDraw.show();
		
		
		
		//drawing
		List <Drawable> scenes = new LinkedList<Drawable>();
		scenes.add(initSeq);
		
		String input = "";
		while(!input.equals("end")) {
			input = ap.nextString("Express Yourself");
			boolean present = composer.containsKey(input);
			if (present) {
				Drawable a = composer.get(input);
				scenes.add(a);
			}
			else {
				if (input.equals("record")) {
					List <Drawable> rScene = new LinkedList<Drawable>();
					String rInput = "";
					while (! rInput.equals("off")) {
						rInput = ap.nextString("Recording on:");
						boolean rPresent = composer.containsKey(rInput);
						if (rPresent) {
							Drawable r = composer.get(rInput);
							rScene.add(r);
							Sequence rSeq = new Sequence(rScene);
							StdDraw.show();
							rSeq.draw();
							StdDraw.show();
						}
						else {
							System.out.println("Invalid Input");
						}
					}
					String rName = ap.nextString("What would you like to name the recording?");
					Sequence rSeq = new Sequence(rScene);
					composer.put(rName, rSeq);
					scenes.add(rSeq);
				}
				
				else {
					System.out.println("All Possible Inputs: ");
					for (String key : composer.keySet()) {
						System.out.println(key);
					}
					System.out.println("---------------------");
				}
			}
			Sequence s = new Sequence(scenes);
			StdDraw.show();
			StdDraw.pause(10);
			s.draw();
			StdDraw.show();
			StdDraw.pause(10);
			
			

		}

	}
}
