package assignment9;

/**
 * Objects that can move themselves as well as draw themselves
 * @author roncytron
 *
 */
public interface Movable extends Drawable {
	
	/**
	 * Change this object's location by the specified displacements
	 * @param dx displacement horizontally
	 * @param dy displacement vertically
	 */
	public void displace(double dx, double dy);
	
	public double getX();
	public double getY();

}
