package Task11;

public class Circle {
	double radius;

	public Circle() {
		this.radius = 1.5;
	}

	public Circle(double radius,String value) {
		this.radius = radius;
	}

	public double CalculateCircumference() {
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(3.0,"radius");
		double circumference1 = circle1.CalculateCircumference();
		double circumference2 = circle2.CalculateCircumference();

		// Printing circumference
		System.out.println("Circumference of circle1: " + circumference1);
		System.out.println("Circumference of circle2: " + circumference2);

	}

}
