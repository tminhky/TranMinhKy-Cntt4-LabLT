// LỚP HÌNH
package Shapee;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {
        return "Shape{" +
                "color=" + color +
                ", filled='" + filled + '\'' +
                '}';
    }
}
// LỚP HÌNH TRÒN
package Shapee;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
		super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI; //diện tích = pi*r*r
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI; //chu vi = 2.pi.r
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
// LỚP HÌNH CHỮ NHẬT
package Shapee;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width, double length, String color, boolean filled)
	{
		super(color, filled);
        this.width = width;
        this.length = length;
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

    public double getArea() {
        return this.width * this.length;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length='" + length + '\'' +
                '}';
    }
}
// LỚP HÌNH VUÔNG 
package Shapee;

public class Square extends Rectangle {
    private double side;
    
    public Square(double side, String color, boolean filled){
       super(side, side, color, filled);
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length='" + length + '\'' +
                '}';
    }
}
// HÀM MAIN
package Shapee;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(1.0, "red", true);				
		Rectangle rectangle = new Rectangle(1.0,1.0,"red",true);
		System.out.println("Area Circle:" + circle.getArea());
    System.out.println("Perimeter Circle:" + circle.getPerimeter());
		System.out.println("Area Rectangle: " + rectangle.getArea());
	}
}
