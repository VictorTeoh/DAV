import cs1.Keyboard;

public class Ticket implements Comparable {

    private int id;
    private int priority;
    private String problemDesc;
    private int status;
    private String userName;
    public String solutionDesc;

    public Ticket() {
    System.out.println("Enter your name");
    userName = Keyboard.readString();

    System.out.println("Please describe your problem");
    problemDesc = Keyboard.readString();

    System.out.println("Now please give us your status. If you are a CEO, enter 0. If you are a manager, enter 1. If you are a general employee, enter 2. Otherwise, enter 3.");
    priority=Integer.parseInt( Keyboard.readString() );
    }

    public int getPriority() {
	return priority;
    }

    public int compareTo(Object x) {
	if( ((Ticket)x).getPriority() < getPriority() ) {
	    return 1;
	}
	return 0;
    }




     public static void main(String args[])
     {
	 Ticket Bob = new Ticket();
	 System.out.println(Bob.userName);
	 System.out.println(Bob.problemDesc);
	 System.out.println(Bob.priority);
    }
	
    
}
