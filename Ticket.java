
import cs1.Keyboard;

public class Ticket implements Comparable {

    private int id;
    private int priority;
    private String problemDesc;
    private int status;
    private String userName;
    public String solutionDesc;

    public Ticket() { //constructor relies on user input for name, problem description, and status
    System.out.println("Enter your name");
    userName = Keyboard.readString();

    System.out.println("Please describe your problem");
    problemDesc = Keyboard.readString();

    System.out.println("Now please give us your status. If you are a CEO, enter 0. If you are a manager, enter 1. If you are a general employee, enter 2. Otherwise, enter 3.");
    priority=Integer.parseInt( Keyboard.readString() );

    status = 1; //status of problem is gonna be 1 as a default, change to 0 when it is resolved 
    }
    //ACCESSORS//
    public String getName() {
	return userName;
    }
    
    public String getProblem() {
	return problemDesc;
    }
    public String getSolution() {
	return solutionDesc;
    }
    
    public int getPriority() {
	return priority;
    }

    public int getID() {
	return id;
    }

    public int getStatus() {
	return status;
    }

    //MUTATORS//
    public void setID(int x) {
	id = x;
    }

    public void setStatus(int x) {
	status = x;
    }

    public void setSolution() {
	System.out.println("Please record the solution");
	solutionDesc = Keyboard.readString();
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
	 Ticket Dave = new Ticket();
	 System.out.println(Bob.compareTo(Dave));
    }
	
    
}
