package assignment9.scenes;

import java.awt.Color;
import java.util.Random;

import assignment9.Drawable;
import assignment9.utils.ColorUtils;
import edu.princeton.cs.introcs.StdDraw;

/**
 * Line in random location
 * 
 * @author roncytron
 *
 */
public class Line implements Drawable {
	private final Color color;
	private final double x1, y1, x2, y2;
	
	public Line() {
		Random r = new Random();
		this.color = ColorUtils.randomColor();
		this.x1 = r.nextDouble();
		this.x2 = r.nextDouble();
		this.y1 = r.nextDouble();
		this.y2 = r.nextDouble();
	}

	@Override
	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.line(x1, y1, x2, y2);
		
	}

}
