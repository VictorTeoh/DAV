
public class HelpDesk{

    private ArrayPriorityQueue<Ticket> _line;//collection of tickets to be handled  
    private ArrayPriorityQueue<Ticket> _archive;//collection of tickets that were handled 
        
    public HelpDesk(){
	_line = new ArrayPriorityQueue<Ticket>(); 
	_archive = new ArrayPriorityQueue<Ticket>();
    }

    public void enQueue(Ticket t){//adds a ticket to the line 
	_line.add(t); 
    }

    public Ticket deQueue(){//removes and returns ticket of highest priority
	return _line.removeMin(); 
    }

    public Ticket peekNext(){//returns ticket of highest priority
	return _line.peekMin(); 
    }

    public Ticket archiveTicket(Ticket t){//put a ticket into the archive
	_archive.add(t); 
    }

    public Ticket getFromArchive(int ticketNumber){//get a ticket from the archive
	return _archive.getList().get(ticketNumber); 
    }

    public static void main(String[] args){
	HelpDesk a = new HelpDesk(); 
	
    }

}
