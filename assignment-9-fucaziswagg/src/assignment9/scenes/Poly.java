package assignment9.scenes;

import java.awt.Color;
import java.util.Random;

import assignment9.Drawable;
import assignment9.utils.ColorUtils;
import edu.princeton.cs.introcs.StdDraw;

/**
 * A random polygon
 * 
 * @author roncytron
 *
 */
public class Poly implements Drawable {
	
	private final double[] x, y;
	private final Color color;
	
	public Poly(int sides) {
		Random r = new Random();
		this.x = new double[sides];
		this.y = new double[sides];
		
		this.color = ColorUtils.randomColor();
		
		for (int i=0; i < sides; ++i) {
			x[i] = r.nextDouble();
			y[i] = r.nextDouble();
		}
	}
	
	/**
	 * Polygon with a random number of sides, but at least 3
	 * 
	 */
	public Poly() {
		this((int)(Math.random()*5+3));
	}

	@Override
	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.filledPolygon(x, y);
	}

}
