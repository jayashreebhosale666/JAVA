import java.util.*;
import java.lang.Math.*;
class Shape
{
private Double length,height,radius;
void accept()
{
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter Length:");
	length=sc.nextDouble();
	System.out.println("Enter height:");
	height=sc.nextDouble();
	System.out.println("Enter radius:");
	radius=sc.nextDouble();
}
Double areaofTriangle()
{
	double area;
	area=(length*height)/2;
	return area;
}
Double areaofCircle()
{
	double area;
	area= Math.PI * radius * radius;
	return area;
}
Double areaofRectangle()
{
	double area;
	area=(length*height);
	return area;
}
}
class Main
{

public static void main(String args[])
{

	Shape s=new Shape();
	s.accept();
	System.out.println("Area Of Triangle: "+s.areaofTriangle());
	System.out.println("Area Of Rectangle: "+s.areaofRectangle());
	System.out.println("Area Of Circle: "+s.areaofCircle());
}
}