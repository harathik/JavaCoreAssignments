
public  class Shapes {


public static class Line1 {
	void draw()
	{
		System.out.println("Drawing Line...");
	}
}


public static class Cube1  {
	void draw()
	{
		
		System.out.println("Drawing Cube...");
	}
}

public static class Rectangle1  {
	void draw()
	{
		System.out.println("Drawing Rectangle...");
	}
}

public static class TestAbs {

	public static void main(String[] args) {
		
		Line1 l = new Line1();
		l.draw();
		Rectangle1 r = new Rectangle1();
		r.draw();
		Cube1 c = new Cube1();
		c.draw();
	}

}

}
