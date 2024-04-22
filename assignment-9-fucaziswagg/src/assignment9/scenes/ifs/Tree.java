package assignment9.scenes.ifs;
import assignment9.utils.ColorUtils;
import edu.princeton.cs.introcs.StdDraw;

/**
 * Adapted from Sedgewick IFS
 * @author roncytron
 *
 */
public class Tree extends IFS {

	// probability distribution for choosing each rule
	@Override
	protected double[] getDist() {
		return new double[] { 0.1,  0.1,  0.2,  0.2,  0.2,  0.2 };
	}

	// update matrices
	@Override
	protected double[][] getCX() {
		return new double[][]{

			{    0.00,  0.00,  0.550 },
			{   -0.05,  0.00,  0.525 },
			{    0.46, -0.15,  0.270 },
			{    0.47, -0.15,  0.265 },
			{    0.43,  0.28,  0.285 },
			{    0.42,  0.26,  0.290 }

		};
	}
	@Override
	protected double[][] getCY() {
		return new double[][] {

			{   0.00,  0.60,  0.000 },
			{  -0.50,  0.00,  0.750 },
			{   0.39,  0.38,  0.105 },
			{   0.17,  0.42,  0.465 },
			{  -0.25,  0.45,  0.625 },
			{  -0.35,  0.31,  0.525 }

		};
	}

	public Tree(double llx, double lly, double size) {
		super(llx, lly, size, ColorUtils.randomColor());
	}
	
	public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();
		StdDraw.show();
		StdDraw.pause(10);
		Tree t = new Tree(0, 0, 1);
		//
		// Make more intense by overdrawing it
		//
		for (int i=0; i < 25; ++i) {
			t.draw();
		}
		StdDraw.show();
		StdDraw.pause(10);
	}

} 

