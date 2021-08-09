
/**
* ADT MyQueue: Private Part<br>. 
* The class implements all the operations available in MyQueue<br>
*/
public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	
	private MyNode head;
	private int numItems;
	

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	//public myQueue myCreateEmpty(){}
	
	public MyDynamicQueue(){//TO-COMPLETE 
		this.head = null;
		this.numItems = 0;
		
		System.out.println("///////////////////");
		

	}
	

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	

	public boolean isEmpty(){//TO-COMPLETE 
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		
	
		return head == null;
	
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get and remove first element from top of MyQueue: dequeue
	//-------------------------------------------------------------------

	public int dequeue(){//TO-COMPLETE 
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		int res = 0;
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;
		if(!isEmpty())
		scenario = 1;
		else
			scenario = 2;

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario) {
		case 1:
			if(!this.isEmpty()) {
				head = head.getNext();
				this.numItems--;
				
			}
			
		case 2:
			System.out.println("The queue is empty(dequeue)");
					
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
		return res;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyQueue: enqueue
	//-------------------------------------------------------------------
	
	public void enqueue(int element){//TO-COMPLETE 
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		MyNode currentNode = head;
		MyNode newNode = null;
	
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		if(isEmpty())
			scenario = 1;
		else 
			scenario = 2;
	
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario) {
		case 1:
			head = new MyNode(element, null);
			numItems ++;
			break;
		case 2:
			MyNode current = head;
			MyNode previous = null;
			while(current.getNext() != null) {
				previous = current;
				current = current.getNext();
			}
			MyNode newnode = new MyNode(element, null);
			current.setNext(newnode);
			numItems ++;
		}
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
		//MyNode currentNode = head;
		MyNode newNode = null;
	
			
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0;
			if(!isEmpty())
				scenario = 1;
			else
				scenario = 2;
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario) {
		case 1:
			
		MyNode current = this.head;	
		    newNode = current.getNext();

		while (newNode != null)
		{
		    current = newNode;
		    newNode = current.getNext();
		}

		System.out.println("Last node is " + current);
			
		
			
		case 2:
			System.out.println("Error queue is empty (rear)");
			}
		return 0;

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
		if(!isEmpty())
			scenario = 1;
		else 
			scenario = 2;
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario) {
		case 1:
			if(!this.isEmpty()) {
				return this.head.getInfo();
			}
		//case 2:
			//System.out.println("Errror the queue is empty(front)");
			

	}
		return 0;
	}
	
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyQueue: print
	//-------------------------------------------------------------------
	
	public void print(){//TO-COMPLETE 

		if(head != null) {
			System.out.println(head.getInfo());
			MyNode current = head;
			while(current.getNext() != null) {
				current = current.getNext();
				System.out.println(current.getInfo());
			}

	}
	
	
}
}
