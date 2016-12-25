// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #3, 3/3/16
// This an interface, that declares methods common to all birds.
import java.awt.Color;
import java.awt.Point;

public interface Bird { //This is the bird interface.
	public Point getPosition(); //This declares the getPosition() method.
	void fly(); //This declares the fly() method.
	public Color getColor();  //This declares the getColor() method.

}
