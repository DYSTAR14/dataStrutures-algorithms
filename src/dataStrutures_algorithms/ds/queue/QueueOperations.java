package dataStrutures_algorithms.ds.queue;

public class QueueOperations {
	
	private Node first;
	private Node last;
	private int length;
	
	public QueueOperations(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length = 1;
		printQueue();
	}
	
	public void enQueue(int value) {
		Node newNode = new Node(value);
		if ( first == null && length == 0) {
			first = newNode;
			last = newNode;
			length = 1;
		} else {
			last.next = newNode;
			last = newNode;
			length++;
		}
		printQueue();
	}
	
	public void deQueue() {
		if ( first == null && length == 0 ) {
			System.out.println("Queue is empty");
		} else if(length == 1 ){
			first = null;
			last = null;
			length--;
		}
		else {
			 Node temp = first;
			 first = first.next;
			 temp.next = null;
			 length--;
		}
		printQueue();
	}
	
	public void printQueue() {
		if (first == null && length == 0) {
			System.out.println("Queue is empty");
		} else {
			Node temp  = first;
			int count = 0;
			while(count < length) {
				count++;
				System.out.print(temp.value+"->");
				temp = temp.next;
			}
			System.out.println();
		}
	}

}
