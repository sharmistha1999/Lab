package Lab1;
import java.util.Scanner;
public class Lab1Exercise2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the colour");
System.out.println("r-red");
System.out.println("y-yellow");
System.out.println("g-green");
char choice=sc.next().trim().charAt(0);
switch(choice)
{
case'r':
	System.out.println("stop");

break;
case'y':
	System.out.println("ready");
	break;
case'g':
	System.out.println("go");
	break;
	default:
		System.out.println("No match");
}
	
sc.close();


	}
}
