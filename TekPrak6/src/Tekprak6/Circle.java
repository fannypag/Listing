package Tekprak6;

//The Circle class models a circle with a radius and color.
public class Circle {
	// private instance variable, not accesible from outside the class
	private double radius;
	private String color;
	
	// Constructors (overloaded)
	// Constructs a Circle instance with default value for radius and color
	public Circle(){
		radius = 1.0;
		color = "red";
	}
	
	// Consctructs a Cirlce instance with the given radius and default color
	public Circle(double r){
		radius = r;
		color = "red";
	}
	
	public Circle(double r, String c){
		radius = r;
		color = c;
	}
	
	// return the radius
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String c){
		color = c;
	}
	
	// return a self-descriptive string of this instance in the form of Circle[radius=?, color=?]
	public String toString(){
		return "Circle[radius]" + radius + " color=" + color + "]"; 
	}
}