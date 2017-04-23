
import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{

    private ArrayList<Ticket> _queue;

    public ArrayPriorityQueue(){
	_queue = new ArrayList<Ticket>();
    }
	
    //for Ticket queues
    public void add(Ticket x){//adding towards the rightmost end to preserve O(1) 
	_queue.add(x); 
    }
	
    public boolean isEmpty(){
	return _queue.size() == 0;
    }
    
    public Ticket removeMin(){//remove the member of highest priority: a deque method
	//go through the ArrayList and find the highest number
	int indexOfLargest = 0; 
	for(int x = 0; x < _queue.size(); x++){
	    if(_queue.get(x).compareTo(_queue.get(indexOfLargest)) == 0){
		indexOfLargest = x;
	    }
	}
	return _queue.remove(indexOfLargest); 
    }
    
    public Ticket peekMin(){
	int indexOfLargest = 0; 
	for(int x = 0; x < _queue.size(); x++){
	    if(_queue.get(x).compareTo(_queue.get(indexOfLargest)) == 0){
		indexOfLargest = x;
	    }
	}
	return _queue.get(indexOfLargest); 	
    }

    public ArrayList<Ticket> getList() {
	return _queue;
    }
    
    //public String toString(){
	
    //}
    
    public static void main(String[] args) {


	
    } 
  
}
