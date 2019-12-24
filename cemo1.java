import java.io.*;
import java.util.*;
class Calculator
{
	public static double powerInt(int num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	public static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1,num2);
	}
}	
public class cemo1
{
	public static void main(String args[])
	{
		Calculator c=new Calculator();
		System.out.println(" "+c.powerInt(12,10));
		System.out.println(" "+c.powerDouble(12.00,10.00));
		
	}
}