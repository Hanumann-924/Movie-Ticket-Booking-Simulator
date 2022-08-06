package CustomerDetails;

import java.util.Date;
import java.util.Scanner;

public class Customer 
{
	Scanner sc = new Scanner(System.in);
	int noofpeople;
	String t;
	int total;
	String s ;
	String num;
	public void details() 
	{
		System.out.println("One Movie : Spiderman");
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		s = sc.nextLine();
		System.out.println("Enter the phone number");
		num = sc.nextLine();
			
	}
	public void timings() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\tMovies Now Playing\t\t\t\t  Timings");
		System.out.print("1.         Spiderman    \t\t\t 11:50    15:00   18:00 ");
		System.out.println();
		System.out.println("Please enter the show timing");
		t = sc.nextLine();
		if(t.equals("11:50")||t.equals("15:00")||t.equals("18:00"))
		{
			System.out.println("You can Proceed");
		}
		else
		{ 
			System.out.println("Time not available"); 
		}
		
	}
	public void displayseats()
	{
		System.out.println("                         Screen this side");
		System.out.println(" \t\t     ╔══════════════════════╗");
		System.out.println(" \t\t     ╚══════════════════════╝");
		System.out.println("\t   ┌───────────────────────────────────────┐");
		System.out.println("\t      	A □ □ □ □ □ □ □ □ □ □ □ □ ");
		System.out.println("\t      	B □ □ □ □ □ □ □ □ □ □ □ □ ");
		System.out.println("\t   ┌───────────────────────────────────────┐");
		System.out.println("\t      	C □ □ □ □ □ □ □ □ □ □ □ □ ");
		System.out.println("\t      	D □ □ □ □ □ □ □ □ □ □ □ □ ");
		System.out.println("\t   ┌───────────────────────────────────────┐");
		System.out.println("\t     	E □ □ □ □ □ □ □ □ □ □ □ □ ");
		System.out.println("\t     	F □ □ □ □ □ □ □ □ □ □ □ □ ");		
		System.out.println("\t   ┌────────────────────────────────────────┐");
		System.out.println("\t      	G □ □ □ □ □ □ □ □ □ □ □ □ ");
		System.out.println("\t      	H □ □ □ □ □ □ □ □ □ □ □ □ ");
		System.out.println("\t   ┌────────────────────────────────────────┐");
		System.out.println("\t      	I □ □ □ □ □ □ □ □ □ □ □ □ ");
		System.out.println("\t      	J □ □ □ □ □ □ □ □ □ □ □ □ ");
		System.out.println("\n\n  Please Enter Preferred Row. Seat will be booked as per availability.");
		
		String row = sc.next();
		
		if(row.equals("A")||row.equals("B")||row.equals("C")||row.equals("D")||row.equals("E")
				||row.equals("F")||row.equals("G")||row.equals("H")||row.equals("I")||row.equals("J")) 
		{
			System.out.println("Enter the no of people to book tickets");
			noofpeople = sc.nextInt();
			int seatno[] =new int[noofpeople];
			for(int i=0;i<noofpeople;i++) 
			{
				System.out.println("Enter the seat Numbers");
				seatno[i]= sc.nextInt();
			}
		}
		else {
			System.out.println("Please enter valid row ");
		}
	}
	public void payment() 
	{
		total = noofpeople*150;
		System.out.println("Amount to be paid: "+total);
		
		System.out.println("Please conform the above amount dowm to get payment successful");
		int conform = sc.nextInt();
		if(conform==total) 
		{
			System.out.println("Your Payment is successful");
		}
		else {
			System.out.println("Payment is failed");
		}
		
	}
	
}
