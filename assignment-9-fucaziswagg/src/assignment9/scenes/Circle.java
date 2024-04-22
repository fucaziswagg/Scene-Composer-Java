package assignment9.scenes;

import java.awt.Color;

import assignment9.Movable;
import assignment9.utils.ColorUtils;
import edu.princeton.cs.introcs.StdDraw;

/**
 * A Circle that can draw and move itself
 * @author roncytron
 *
 */
public class Circle implements Movable {

	private final Color color;
	private final double radius;
	private double x, y;
	
	/**
	 * 
	 * @param x the horizontal coordinate of this Circle
	 * @param y the vertical coordinate of this Circle
	 * @param radius the radius of this Circle
	 */
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = ColorUtils.randomColor();
	}
	
	@Override
	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.filledCircle(x, y, radius);
		
	}

	@Override
	public void displace(double dx, double dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

	@Override
	public double getX() {
		return this.x;
	}

	@Override
	public double getY() {
		return this.y;
	}

}
