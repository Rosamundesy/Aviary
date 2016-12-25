// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #3, 3/3/16
// This the hummingbird subclass.
import java.awt.Color;
import java.awt.Point;
import java.util.Random;
public class Hummingbird extends AbstractBird{
	public Hummingbird(int x, int y) {
		point = new Point(x,y);// This constructs the hummingbird object.
	}
	public Color getColor(){
		return Color.MAGENTA;
	}


	public void fly(){
			Random r = new Random();
			int tempx = r.nextInt(20);
			int tempy = r.nextInt(20);
			point.setLocation(tempx,tempy);
		}
	}
