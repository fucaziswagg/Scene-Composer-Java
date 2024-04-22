package assignment9.scenes;

import java.awt.Color;

import assignment9.Movable;
import assignment9.utils.ColorUtils;
import edu.princeton.cs.introcs.StdDraw;

public class Square implements Movable {

	private final Color color;
	private final double radius;
	private double x, y;
	
	public Square(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = ColorUtils.randomColor();
	}
	
	@Override
	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.filledSquare(x, y, radius);
		
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
