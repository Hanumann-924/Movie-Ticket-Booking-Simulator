package LoginPage;

import java.util.Scanner;

public class Login 
{
	public void sampleLogin()
	{
		String Username;
		String Password;
		
		Username = "Admin";
		Password = "Admin";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = sc.next();
		
		System.out.println("Enter the Password");
		String password = sc.next();
		
		if(username.equals(Username)&&password.equals(Password)) {
			System.out.println("Login Successfull");
		}
		else if(username.equals(Username)) {
			System.out.println("Invalid Password");
			
			
		}
		else if(password.equals(Password)) {
			System.out.println("Invalid usename");
		}
		else {
			System.out.println("Invalid username and password");
			System.exit(0);
		}
		if(!(Password.equals(password)))
		{
			System.out.println("Do you want to change password(y or n)?");
			char d= sc.next().charAt(0);
			if(d=='y') 
			{
				System.out.println("enter the remember old password");
				String e = sc.next();
				if(e.equals(Password)) {
					System.out.println("enter new password");
					String a = sc.next();
					Password=a;
					System.out.println("Password has been changed,Please the run the program again");
				}
				else {
					System.out.println("Wrong Password");
				}
			}
			if(d=='n') {
				System.out.println("Password Not changed");
			}
		}
		
		
		
		
	}
}
