# DAV - David Apterman, Allard Peng, Victor Teoh

Our Design: 

Our implementation for a Help Desk used the classes HelpDesk, Ticket, and ArrayPriorityQueue. 

- HelpDesk.java: This class assigns ticket number, handles tickets from the line, archives them, and can view previous tickets. HelpDesk uses an ArrayPriorityQueues that represents the current line in front of the desk; an ArrayList as an archive that stores previous issues; and a counter variable that would count how many tickets have been handled (this is also used to assign ticket number). 


- Ticket.java: This class represents the ticket and everything a ticket is. This class just has all the qualities of a ticket as mentioned in class. 


- ArrayPriorityQueue.java: The implementation of a Priority Queue using an ArrayList. This is the _line that the HelpDesk class refers to. 


Embellishments: 

- Archive: As mentioned above, the archive is an ArrayList in the HelpDesk class that just stores the resolved tickets. One can access the archive using methods in HelpDesk (since the ticket number of all tickets in the archive IS the index of the ArrayList that the ticket is stored in, you can easily pull up a ticket by its number).  
