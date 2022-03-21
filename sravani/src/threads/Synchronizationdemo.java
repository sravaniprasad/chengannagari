package threads;

class BookMyShow{
	static int total_tickets=10;
	synchronized public void bookticket(int ticket) {
		if(total_tickets>=ticket) {
			total_tickets-=ticket;
			System.out.println(ticket+" have been booked and remaining tickets are "+total_tickets);
		}
		else if(total_tickets<=10){
			System.out.println("sorry tickets are booked");
		}
		else {
			System.out.println(" sorry"+total_tickets+" are remaining");
		}
	}
}

public class Synchronizationdemo  extends Thread
{
static BookMyShow bookmyshow;
 int tickets;
public Synchronizationdemo (BookMyShow bookmyshow) {
	this.bookmyshow=bookmyshow;
}
public void run() {
	bookmyshow.bookticket(tickets);
}

	public static void main(String[] args) {
		bookmyshow=new BookMyShow();
		Synchronizationdemo obj=new Synchronizationdemo (bookmyshow);
		obj.tickets=6;
		obj.start();
		
		Synchronizationdemo obj1=new Synchronizationdemo (bookmyshow);
		obj1.tickets=4;
		obj1.start();
		
				
	}

}
