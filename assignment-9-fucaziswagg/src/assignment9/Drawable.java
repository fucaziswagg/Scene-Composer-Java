package assignment9;

/**
 * A simple interface to unify things that can draw themselves
 * @author roncytron
 *
 */
public interface Drawable {
	
	/**
	 * When called, an object should draw itself on the Sedgewick canvas
	 *    assuming the usual coordinates:
	 *    (0,0) is lower left corner
	 *    (1,1) is upper right corner
	 *    
	 * It is completely up to the object how to draw itself, BUT
	 *    Objects should refrain from calling StdDraw.clear() or StdDraw.show(..)
	 *    so as not to interfere with other objects wanting to draw themselves
	 *    before or after that object.
	 */
	public void draw();

}
