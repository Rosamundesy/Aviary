// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #3, 3/3/16
// This an abstract class, that defines color and point fields, which are the same for all birds. 
import java.awt.Color;
import java.awt.Point;
public abstract class AbstractBird implements Bird{
		Color color;
		Point point;
	public Point getPosition(){ //This returns the position.
		return point.getLocation();
	}
}
