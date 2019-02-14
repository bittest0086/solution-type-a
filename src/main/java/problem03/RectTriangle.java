package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		System.out.println("");
		return this.height * this.width;
	}

	@Override
	public double getPerimeter() {
		return 0.;
	}
}
