package javaOopsAssignment;

public class Rectangle extends Shapes {

	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.length=length;
		this.width=width;
	}
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}


	@Override
	public double area() {		
		return getWidth()*getLength();
	}


	
	
}
