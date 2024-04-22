package assignment9.scenes;

import java.util.LinkedList;
import java.util.List;

import assignment9.Drawable;
import assignment9.scenes.ifs.Dragon;
import edu.princeton.cs.introcs.StdDraw;

/**
 * A sequence (list) of Drawables
 * @author roncytron
 *
 */
public class Sequence implements Drawable {

	private final List<Drawable> seq;

	public Sequence(List<Drawable> seq) {
		this.seq = seq;
	}

	@Override
	public void draw() {
		for (Drawable d : seq) {
			d.draw();
		}	
	}

	public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();
		List<Drawable> list = new LinkedList<Drawable>();
		list.add(new Bubbles(100));
		list.add(new Dragon(0,0,1));
		Forest f = new Forest(10);
		for (int i=0; i < 100; ++i) {
			list.add(f);
		}
		Sequence s = new Sequence(list);
		StdDraw.show();
		StdDraw.pause(10);
		s.draw();
		StdDraw.show();
		StdDraw.pause(10);
	}

}
