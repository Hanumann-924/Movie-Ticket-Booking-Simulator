package CustomerDetails;

import java.util.Date;

public class ViewTicket extends Customer
{
	
	public ViewTicket(Customer C1) 
	{
		
		this.s = C1.s;
		this.num = C1.num;
		this.t = C1.t;
		this.total = C1.total;
	}

	public void print_ticket() 
	{
		Date date = new Date();
		System.out.println("========================S2 Cinemas=======================");
		System.out.println("\t\t      ----Ticket----");
		System.out.println("\t\t Name : "+ s);
		System.out.println("\t\t Phone Number: "+ num);
		System.out.println("\tMovie: Spiderman");
		System.out.print("\tTime: "+t);
		System.out.println("\t\t\tScreen:1");
		System.out.println("\tDate: "+date);
		System.out.println("\tPrice: ₹"+total);
		System.out.println("\tThank You! Hope to see you again soon!\n\n");
	}
}
