// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #3, 3/3/16
// This the vulture subclass.
import java.awt.Color;
import java.awt.Point;
public class Vulture extends AbstractBird{
	int checky=0;
	public Vulture(int x, int y) { 
		point = new Point(x,y);//This constructs the vulture object. 
	}
	public Color getColor(){ //This returns its color.
		return Color.BLACK;
	}


	public void fly(){ //This flies the vulture by starting a counter and having the vulture fly a different way each time fly() is called.
			checky++;
			if (checky%4==2){
			point.setLocation(point.getX(), point.getY()-1);
			
		} else if (checky%4==3){
			point.setLocation(point.getX()-1, point.getY());
			
		}else if (checky%4==0){
			point.setLocation(point.getX(), point.getY()+1);
			
		}else {

			point.setLocation(point.getX()+1, point.getY());
		}
	}
}
