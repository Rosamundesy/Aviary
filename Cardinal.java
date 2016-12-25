// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #3, 3/3/16
// This the cardinal subclass.
import java.awt.Color;
import java.awt.Point;
public class Cardinal extends AbstractBird{
	int check=0;
	public Cardinal(int x, int y) {
		point = new Point(x,y); //This constructs the Cardinal object.
	}
	public Color getColor(){ //This returns the color.
		return Color.RED;
	}


	public void fly(){//This returns the flight path.
			if (point.getY() ==1 || point.getY()==20){ //This checks if the bird is flying up or down by keeping track of which wall it hit last. 
				check++;}
			if (check%2==1){
				point.setLocation(point.getX(), point.getY()+1); //This flies the bird up.
				
			} else {
				point.setLocation(point.getX(),point.getY()-1); //This flies the bird down.
			}
		}
	}

