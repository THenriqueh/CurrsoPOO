package entities;

public class Retangle {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	public double perimeter(){
		return 2*(width + height);
	}

}
