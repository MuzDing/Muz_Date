package day3;

public class Point {

	private double point_x;
	private double point_y;

	public Point() {
		this.point_x = 1.00;
		this.point_y = 1.00;
	}

	public double getX() {
		return point_x;
	}

	public void setX(double point_x) {
		this.point_x = point_x;
	}

	public double getY() {
		return point_y;
	}

	public void setY(double point_y) {
		this.point_y = point_y;
	}

	@Override
	public String toString() {
		return "Point [point_x=" + point_x + ", point_y=" + point_y + "]";
	}

	public double distance() {
		return Math.sqrt(Math.pow(this.point_x, 2) + Math.pow(this.point_y, 2));
	}

}
