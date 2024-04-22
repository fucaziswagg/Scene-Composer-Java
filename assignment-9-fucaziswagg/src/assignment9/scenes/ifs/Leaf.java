package assignment9.scenes.ifs;
import assignment9.utils.ColorUtils;
import edu.princeton.cs.introcs.StdDraw;

/**
 * Adapted from Sedgewick IFS
 * @author roncytron
 *
 */
public class Leaf extends IFS {

	// probability distribution for choosing each rule
	@Override
	protected double[] getDist() {
		return new double[] { .02, .15, .13, .70 };
	}

	// update matrices
	@Override
	protected double[][] getCX() {
		return new double[][]{

			{   000,  .000,  .500 }, 
			{ -.139,  .263,  .570 }, 
			{  .170, -.215,  .408 }, 
			{  .781,  .034,  .1075 }

		};
	}
	@Override
	protected double[][] getCY() {
		return new double[][] {

			{  .000,  .270,  .000 }, 
			{  .246,  .224, -.036 }, 
			{  .222,  .176,  .0893 }, 
			{ -.032,  .739,  .270 }
		};
	}

	public Leaf(double llx, double lly, double size) {
		super(llx, lly, size, ColorUtils.randomColor());
	}
	
	public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();
		StdDraw.show();
		StdDraw.pause(10);
		Leaf t = new Leaf(0, 0, 1);
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

