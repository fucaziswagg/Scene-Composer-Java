package assignment9.scenes;

import java.awt.Color;

import assignment9.Drawable;
import edu.princeton.cs.introcs.StdDraw;

/**
 * Clear the screen by drawing a large WHITE filledRectangle
 * 
 * @author roncytron
 *
 */
public class Clear implements Drawable {

	@Override
	public void draw() {
		StdDraw.setPenColor(Color.WHITE);
		//
		// much larger than needed
		//
		StdDraw.filledRectangle(0.5, 0.5, 2, 2);
	}

}
