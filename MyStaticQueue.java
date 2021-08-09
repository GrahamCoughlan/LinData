/**
* ADT MyQueue: Private Part<br>. 
* The class implements all the operations available in MyQueue<br>
*/

// Java code to find first and last element
// of ArrayList
  

public class MyStaticQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private int items[]; 
	private int numItems;
	private int maxItems;

	//-------------------------------------------------------------------
	//-------------------------------------------------------------------	
	//public myQueue myCreateEmpty(){}
	
	/**
	 * The constructor creates 1 instance (1 object) of the class MyStaticQueue<br>
	 * @param m: The maximum number of items MyQueue can contain.
	 */	 
	public MyStaticQueue(int m){//TO-COMPLETE 
		this.maxItems = m;
		
		final int[] i = new int[m];
		this.items = i;
		this.numItems = 0;

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyQueue, it returns whether it is empty or not.<br>
	 * @return: Whether MyQueue is empty or not.
	 */	
	public boolean isEmpty(){//TO-COMPLETE 
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		return numItems == 0;
	}
	
	//public int getElement(int index){
		//int res = 0;
		
	//	int scenario = 0;
		//if (0 <= index && index < numItems) 
		//scenario = 1;
	//	else
		//	scenario = 2;
		
		//switch(scenario) {
		//case 1:
		//	res = items[index];
		//	break;
		//case 2:
		//	System.out.println("The Queue is empty");
	///	break;
	//	}
	//	return res;
	//}// will return the items in the list and will give an error if the list is empty

	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get and remove first element from top of MyQueue: dequeue
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, it returns element at the top of the queue (if any).<br>
	 * @return: Head element from MyQueue (ERROR if there are no items in MyQueue).
	 */	
	public int dequeue(){//TO-COMPLETE 
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = -1;
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;
		
		if (numItems > 0)
			scenario = 1;//checking to see if the queue is empty
		else
			scenario = 2;//the queue is empty
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		
		switch(scenario) {
		case 1:
			
			int i = items[maxItems - numItems];
			
			numItems--;
			res = i;
			
			break;
		case 2:
			System.out.println("Error, no more room in the queue");
			break;
		}
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

		
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyQueue: enqueue
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, add an item to the back of the queue.<br>
	 * @param element: New item to be added to MyQueue.	 
	 */	
	public void enqueue(int element){//TO-COMPLETE 
		//-----------------------------
		//SET OF OPS
		//-----------------------------
	
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;
		
		if(numItems < maxItems) {
			scenario = 1;
		}else {
			scenario = 2;
		}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario) {
		case 1:
			
			for(int i = items.length -2; i >= 0; i--)
				items[i+1] = items[i];
				items[0] = element;
				numItems++;
				break;
				
		case 2:
			System.out.println("The queue is already full");
			break;
		}

	}
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> get the item at the top of myqueue: front
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, get the item at the top of the queue..<br>
	 * @return: item at top of  MyQueue.	 
	 */	
	public int front(){//TO-COMPLETE 
		//-----------------------------
		//SET OF OPS
		//-----------------------------
	
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;
		if(numItems > 0) {
			scenario = 1;
	}else {
		scenario = 2;
	}

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario) {
		case 1:
			
			if(!this.isEmpty()) 

			for(int i : this.items) 
				if(i != 0) 
					return i;
			break;
			
		case 2:
			System.out.println("queue is empty");
			break;
		
		}
	


	return 0;
	}
	
		
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> get the item at the top of myqueue: front
	//-------------------------------------------------------------------
	/**
	* Given a concrete MyQueue, get the item at the back of the queue..<br>
	* @return: item at back of  MyQueue.	 
	*/	
	public int rear(){//TO-COMPLETE 
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		int scenario = 0;
		if (numItems > 0) {
			scenario = 1;
		}else {
			scenario = 2;
		
		}
		
		
			
		//----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		switch(scenario) {
		case 1:
			int last = items[items.length -1];
			
			return last;
			
		case 2:
			System.out.println("Stack is empty");
			break;
			
		}
		return 0;
	
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyQueue: print
	//-------------------------------------------------------------------
	/**
	 * Given a concrete MyQueue, prints all the elements (if any).<br>
	 * 
	 */	
	public void print(){//TO-COMPLETE 
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		for (int element: items) {
			if(element != 0)
				
				System.out.print(" , " + element);
		}
		
		

	}
	
}
