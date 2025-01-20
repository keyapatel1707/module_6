package oop;
class shape
{
	void draw() {
		System.out.println("draw shape");
		
	}
}

class circle extends shape
{
	void draw()
	{
		System.out.println("draw circle");
	}
}

class rectangle extends shape
{
	void draw()
	{
		System.out.println("drawvrectangle");
	}
}
public class methodoverridding {

	public static void main(String[] args) {
		shape shape;
		shape= new circle();
		shape.draw();
		shape= new rectangle();
		shape.draw();
	}

}
