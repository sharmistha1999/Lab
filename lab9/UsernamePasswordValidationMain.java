package com.capgemini.lab9;
import java.util.Scanner;
/**
 * 
 * @author Sharmistha Roy
 *
 */

public class UsernamePasswordValidationMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		UsernamePasswordValidationUsingLambdaExpression upv = (username,password)->{
			return (username.equals("sharmistha") && password.equals("sharmistha1234"));
		};
		
		System.out.print("Enter the username : ");
		String username=sc.next();
		
		System.out.print("Enter the password : ");
		String password=sc.next();
		
		System.out.println("\nAuthentication Status : "+upv.validateusername_password(username, password));
		sc.close();
	}

}
