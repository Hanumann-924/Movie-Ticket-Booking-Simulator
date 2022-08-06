package MainPage;

import java.util.Scanner;

import CustomerDetails.Customer;
import CustomerDetails.ViewTicket;
import LoginPage.Login;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("\t     WELCOME TO MOVIE TICKET BOKKING SIMULATOR!!");
		System.out.println("\t\tCREATED BY – THIRUWIEDDHI HANUMANN");
		System.out.println();
		Login l= new Login();
		l.sampleLogin();
		System.out.println("please enter the choice you want \n "
				+ "1.Movies 2.exit");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		Customer C = new Customer();
		switch(option) {
		case 1: 
			C.details();
			C.timings();
			C.displayseats();
			C.payment();
			ViewTicket vc = new ViewTicket(C);
			vc.print_ticket();
		case 2:
			System.exit(0);
		}
	}
}
