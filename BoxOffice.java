package com.jsp.relationship;
import java.util.Scanner;

public class BoxOffice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theatre theatre = new Theatre("INOX",500);
        Boolean flag=true;
        while(flag) {
        	System.out.println("Enter 1.Show Seat Availability 2.book ticket "+"3.To check ticket details  4.Cancel ticket, 5.Exit");
			int n=sc.nextInt();
			switch (n) {
			case 1:{
				int number_of_seats=theatre.getNo_of_seats();
				System.out.println(number_of_seats+"Seats are available");
			}
			break;
			case 2:{
				System.out.println("Enter the movie name");
				String name=sc.next();
				System.out.println("Enter the number of seats");
				int num=sc.nextInt();
				theatre.setTicket(new Ticket(name,num));
				int res=theatre.bookTicket();
				System.out.println("Successfully booked"+res+"tickets");
			}break;
			case 3:{
				System.out.println("Ticket Details");
				Ticket t=theatre.getTicket();
				System.out.println(t.getMovie_name());
				System.out.println(t.getNo_of_tickets());
				
			}break;
			case 4:{
				System.out.println("Enter the number of tickets to be cancelled");
				int cancel=sc.nextInt();
				theatre.cancelTicket(cancel);
			}break;
			case 5:{
				System.out.println("Case 5");
				flag=false;
			}break;
			default:{
				System.out.println("wrong input");
			}break;
			}	
	   }  
	}
}
