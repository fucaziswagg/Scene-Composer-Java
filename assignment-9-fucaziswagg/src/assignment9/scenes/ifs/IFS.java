package assignment9.scenes.ifs;
import java.awt.Color;

import assignment9.Drawable;
import assignment9.utils.ColorUtils;
import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

/**
 * RKC Note:  This code is taken from Sedgewick's IFS code in the code base of our text
 */
/*************************************************************************
 *  Compilation:  javac IFS.java
 *  Execution:    java IFS N < input.txt
 *  Dependencies: StdDraw.java
 *
 *
 *************************************************************************/

abstract public class IFS implements Drawable {
	
	
	private final double llx, lly, size;
	private final int iters;
	private final Color c;
	
	public IFS(double llx, double lly, double size) {
		this(llx, lly, size, ColorUtils.randomColor());
	}
	
	/**
	 * 
	 * @param llx lower left x coordinate
	 * @param lly lower left y coordinate
	 * @param size size
	 * @param c color
	 */
	public IFS(double llx, double lly, double size, Color c) {
		this.llx   = llx;
		this.lly   = lly;
		this.size  = size;
		this.iters = (int)(10000*size);
		this.c     = c;
	}
	
	abstract protected double[] getDist();
	abstract protected double[][] getCX();
	abstract protected double[][] getCY();
	
	@Override
	public void draw() {
		// probability distribution for choosing each rule
		double[] dist = getDist();

		// update matrices
		double[][] cx=getCX();
		double[][] cy=getCY();

		StdDraw.setPenColor(c);
		// current value of (x, y)
		double x = 0.0, y = 0.0;

		// do T iterations of the chaos game
		for (int t = 0; t < this.iters; t++) { 

			// pick a random rule according to the probability distribution
			int r = StdRandom.discrete(dist); 

			// do the update
			double x0 = cx[r][0]*x + cx[r][1]*y + cx[r][2]; 
			double y0 = cy[r][0]*x + cy[r][1]*y + cy[r][2]; 
			
			x = x0; 
			y = y0; 

			// draw the resulting point
			StdDraw.point(llx+x*size, lly+y*size); 

		} 
	}	

} 

