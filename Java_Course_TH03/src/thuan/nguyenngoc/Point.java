package thuan.nguyenngoc;

public class Point {
	private float x;
	private float y;

	public Point() {
		this.x = Math.round(Math.random());
		this.y = Math.round(Math.random());
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}