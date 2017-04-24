
import java.util.ArrayList;

public class HelpDesk{

    private static ArrayPriorityQueue _line;//collection of tickets to be handled  
    private static ArrayList _archive;//collection of tickets that were handled 
    private static int _counter; //assigns id to each subsequent ticket
    public HelpDesk(){
	_line = new ArrayPriorityQueue(); 
	_archive = new ArrayPriorityQueue();
	_counter = 0;
    }

    public void enQueue(Ticket t){//adds a ticket to the line
	t.setID(_counter);
	_line.add(t);
	_counter++;
    }

    public Ticket deQueue(){//removes and returns ticket of highest priority
	return _line.removeMin(); 
    }

    public Ticket peekNext(){//returns ticket of highest priority
	return _line.peekMin(); 
    }

    public void archiveTicket(Ticket t){//put a ticket into the archive
	_archive.add(t); 
    }

    public Ticket getFromArchive(int ticketNumber){//get a ticket from the archive
	return _archive.getList().get(ticketNumber); 
    }

    public static void main(String[] args){
	HelpDesk a = new HelpDesk(); 
	Ticket first = new Ticket();
	Ticket second = new Ticket();
	Ticket third = new Ticket();
	a.enQueue(first);
	a.enQueue(second);
	a.enQueue(third);
       System.out.println(_line.peekMin().getPriority());
	
    }

}
