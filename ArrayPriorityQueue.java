//JAD: Jeffrey Weng, Allard Peng, Dasha Shifrina
//APCS2 pd3
//hw32 -- Getting Past the Velvet Rope
//2017-04-19

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{

    private ArrayList _priorityQ;

    public ArrayPriorityQueue(){
	_priorityQ = new ArrayList();
    }
    //for int queues
    public void add(int x){
	_priorityQ.add(x);
    }
    //for string queues
    public void add(String x){//adding towards the rightmost end to preserve O(1) 
	_queue.add(x); 
    }
    public boolean isEmpty(){
	return _priorityQ.size() == 0;
    }
    
    public int peekMin(){
	if(!isEmpty()){
	    int min = (int)_priorityQ.get(0);
	
	    for(int i = 1; i < _priorityQ.size(); i++){
		if((int)_priorityQ.get(i) < min ){
		    min = (int)_priorityQ.get(i);
		}
	    }
	    return min;
	}
	return -1;
	
	
    }

    public int removeMin(){
	for(int i = 0; i < _priorityQ.size(); i++){
	    if((int)_priorityQ.get(i) == peekMin()){
		int min =(int)_priorityQ.get(i);
		_priorityQ.remove(i);
		return min;
	    }
	}
	return -1;
    }

    public String removeMin(){//remove the member of highest priority: a deque method
	//go through the ArrayList and find the highest number
	int indexOfLargest = 0; 
	for(int x = 0; x < _queue.size(); x++){
	    if(_queue.get(x).compareTo(_queue.get(indexOfLargest)) > 0){
		indexOfLargest = x;
	    }
	}
	return _queue.remove(indexOfLargest); 
    }
    
    public String peekMin(){
	int indexOfLargest = 0; 
	for(int x = 0; x < _queue.size(); x++){
	    if(_queue.get(x).compareTo(_queue.get(indexOfLargest)) > 0){
		indexOfLargest = x;
	    }
	}
	return _queue.get(indexOfLargest); 	
    }
    public String toString(){
	return _priorityQ.toString();
    }
    
    public static void main(String[] args) {
	PriorityQueue item = new ArrayPriorityQueue();
	System.out.println(item);
	System.out.print("Empty?: ");
	System.out.println(item.isEmpty());
	item.add(5);
	item.add(1);
	item.add(3);
	item.add(4);
	item.add(6);
	item.add(1);
	System.out.println(item);
	System.out.print("min: ");
	System.out.println(item.peekMin());
	System.out.print("Empty?: ");
	System.out.println(item.isEmpty());

	System.out.println("Removing highest priority(minimum)");
	System.out.println(item.removeMin());

	System.out.println("Printing out queue");
	System.out.println(item);

	

	
    } 
  
}
