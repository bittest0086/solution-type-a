package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		System.out.println("");
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double rate) {
		this.width *= rate;
		this.height *= rate;
	}

	@Override
	public double getArea() {
		return this.width * this.height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}
	
}