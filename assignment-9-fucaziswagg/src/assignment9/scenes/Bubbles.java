package assignment9.scenes;

import assignment9.Drawable;
import edu.princeton.cs.introcs.StdDraw;

public class Bubbles implements Drawable {
	
	private Circle[] bubbles;
	
	public Bubbles(int num) {
		this.bubbles = new Circle[num];
		for (int i=0; i < num; ++i) {
			bubbles[i] = new Circle(Math.random(), Math.random(), Math.random()/20);
		}
	}

	@Override
	public void draw() {
		for (Circle c : bubbles) {
			c.draw();
		}
		
	}

//	public static void main(String[] args) {
//		Bubbles b1 = new Bubbles(150);
//		StdDraw.show(10);
//		b1.draw();
//		StdDraw.show(10);
//	}
	
	
}
