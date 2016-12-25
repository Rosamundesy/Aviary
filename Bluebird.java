// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #3, 3/3/16
// This the bluebird subclass.
import java.awt.Color;
import java.awt.Point;
public class Bluebird extends AbstractBird{
	int check=0;
	int checky=0;
	public Bluebird(int x, int y) {
		point = new Point(x,y);// This creates the bluebird object.
	}
	public Color getColor(){ //This returns the color.
		return Color.BLUE;
	}

	public void fly(){
		if (point.getX() ==1 || point.getX()==20){ //This flies the bird, checking how many times it has hit the side wall.
			check++;}
		if (check%2==1){
			checky++; //This checks if the last flight was y up or down, and flies the bird accordingly.
			if (checky%2==0){
			point.setLocation(point.getX()+1, point.getY()+1);
			
		} else {
			point.setLocation(point.getX()+1, point.getY()-1);
		}}else {
			checky++;
			if (checky%2==0){
			point.setLocation(point.getX()-1, point.getY()+1);
			
		} else {
			point.setLocation(point.getX()-1, point.getY()-1);
		}
		}
	}
}
