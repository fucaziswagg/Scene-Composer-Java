package assignment9.scenes.ifs;
import assignment9.utils.ColorUtils;
import edu.princeton.cs.introcs.StdDraw;

/**
 * Adapted from Sedgewick IFS
 * @author roncytron
 *
 */
public class Dragon extends IFS {

	// probability distribution for choosing each rule
	@Override
	protected double[] getDist() {
		return new double[] { 0.787473,  0.212527 };
	}

	// update matrices
	@Override
	protected double[][] getCX() {
		return new double[][]{

			 {  0.824074,  0.281482, -0.1002660 },
			 {  0.088272,  0.520988,  0.5344000 }

		};
	}
	@Override
	protected double[][] getCY() {
		return new double[][] {

			{  -0.212346,  0.864198,  0.0951123 },
			{  -0.463889, -0.377778,  1.0415240 }
		};
	}

	public Dragon(double llx, double lly, double size) {
		super(llx, lly, size, ColorUtils.randomColor());
	}
	
	public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();
		StdDraw.show();
		StdDraw.pause(10);
		Dragon t = new Dragon(.25, .25, .5);
		for (int i=0; i < 25; ++i) {
			t.draw();
		}
		StdDraw.show();
		StdDraw.pause(10);
	}

} 

