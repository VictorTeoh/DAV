
import java.util.ArrayList;

public class HelpDesk{

    private static ArrayPriorityQueue _line;//collection of tickets to be handled  
    private static ArrayList<Ticket> _archive;//collection of tickets that were handled 
    private static Ticket _currentTicket; //the current ticket that is being handled		
    private static int _counter; //assigns id to each subsequent ticket
    public HelpDesk(){
	_line = new ArrayPriorityQueue(); 
	_archive = new ArrayList<Ticket> ();
	_currentTicket = null;     
	_counter = 0;
    }

    public void enQueue(Ticket t){//adds a ticket to the line	
	_line.add(t);	
    }

    public Ticket deQueue(){//removes and returns ticket of highest priority. This ticket is now being handled by the help desk 	    
	Ticket ret = _line.removeMin();
	ret.setID(_counter);    
	_currentTicket = ret;
	_counter++;    
	return ret; 
    }

    public Ticket peekNext(){//returns ticket of highest priority
	return _line.peekMin(); 
    }			
	
    public boolean resolveTicket(Ticket t){//resolves ticket by setting status at 0, meaning it is resolved
	t.setStatus(0);     
	return true;     
    }
	
    public boolean archiveTicket(Ticket t){//tries to archive the ticket, if the status is resolved, then it is archived and return true; false otherwise
	if(t.getStatus() == 0){
		System.out.println("Issue has been resolved and stored in our database. Have a good day, " + t.getName() + "."); 
		_archive.add(t);
		_currentTicket = null; 
		return true; 
	}
	else{
		return false; 
	}
    }		

    public Ticket getFromArchive(int ticketNumber){//get a ticket from the archive
	return _archive.get(ticketNumber); 
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
