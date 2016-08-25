import java.util.Scanner;

public class Modulus
	{
	public static void main(String[] args)
		{
//		exercise1();
		exercise2();
//		exercise3();
//		exercise4();
		}
//	public static void exercise1()
//		{
//		Scanner number = new Scanner(System.in);
//		System.out.println("Enter any number.");
//		int evenOdd = number.nextInt();
//		if(evenOdd%2 == 1)
//			{
//			System.out.println("That's an odd number.");	
//			}
//		else
//			{
//			System.out.println("That's an even number.");
//			}
//		}
	public static void exercise2()
		{
		Scanner year = new Scanner(System.in);
		System.out.println("Enter a year.");
		int leapYear = year.nextInt();
		if(leapYear%4 == 0)
			{
			System.out.println("That is a leap year.");
			}
		else
			{
			System.out.println("That is not a leap year.");
			}
		}
	}
