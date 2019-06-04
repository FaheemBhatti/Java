
public class Circle implements Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double Area()
	{
		return 2*3.14*radius*radius;
	}

}
