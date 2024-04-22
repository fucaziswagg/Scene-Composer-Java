package assignment9.scenes;

import java.util.HashSet;
import java.util.Set;

import assignment9.Drawable;
import assignment9.scenes.ifs.Leaf;
import edu.princeton.cs.introcs.StdDraw;

public class Leaves implements Drawable {
	
	private Set<Leaf> leaves;
	public Leaves(int numTrees) {
		this.leaves = new HashSet<Leaf>();
		for (int i=0; i < numTrees; ++i) {
			leaves.add(new Leaf(2*Math.random()-1.0, 2*Math.random()-1.0, Math.random()));
		}
	}
	
	@Override
	public void draw() {
		for (Leaf t : leaves) {
			t.draw();
		}
	}
	
	public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();
		Leaves f = new Leaves(100);
		StdDraw.show();
		StdDraw.pause(10);
		f.draw();
		StdDraw.show();
		StdDraw.pause(10);
	}

}
