import java.io.*;
import java.util.*;
class Box
{
	double h,w,d;
	Box(double width,double height,double depth )
	{
		h=height;
		w=width;
		d=depth;
	}
	double volume()
	{
		return h*w*d;
	}
}	
public class cemo
{
	public static void main(String args[])
	{
		double width,height,depth;
		Scanner sc=new Scanner(System.in);
		width=sc.nextDouble();
		height=sc.nextDouble();
		depth=sc.nextDouble();
		Box b=new Box(width,height,depth);
		System.out.println("the volume is:"+b.volume());
	}
}