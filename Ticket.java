package com.jsp.relationship;

public class Ticket {
private String movie_name;
private int no_of_tickets;
//constructor
public Ticket(String m, int n) {
	this.movie_name=m;
	this.no_of_tickets=n;
}
public String getMovie_name() {
	return movie_name;
}
public void setMovie_name(String movie_name) {
	this.movie_name = movie_name;
}
public int getNo_of_tickets() {
	return no_of_tickets;
}
public void setNo_of_tickets(int no_of_tickets) {
	this.no_of_tickets = no_of_tickets;
}
public void printTicketDetails() {
	System.out.println("===TICKET===");
	System.out.println("Movie name is "+ movie_name);
	System.out.println("Ticket booked: "+no_of_tickets);
}
}
