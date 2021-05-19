package Lab1;
import java.util.Scanner;

public class Lab1Exercise4 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter max number");
String input = scanner.nextLine();
int maxNumber = Integer.parseInt( input);
System.out.println("list of the number between 1 to"+ maxNumber);
for( int num=2; num <= maxNumber; num++)
{
	boolean isPrime = true;
	for( int i=2;i<= num/2;i++)
	{
		if(num % i ==0)
		{
			isPrime= false;
			break;
		}
	}
	if(isPrime == true)
		System.out.println(num);
}

sc.close();
	}

}
