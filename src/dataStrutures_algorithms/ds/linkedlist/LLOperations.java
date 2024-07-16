package dataStrutures_algorithms.ds.linkedlist;

public class LLOperations {
	Node head;
	Node tail;
	int length;
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
			length = 1;
			System.out.println("Enter Value at Start:" + newNode.data);
			printLL();
		} else {
			newNode.next = head;
			head = newNode;
			length++;
			System.out.println("Enter Value at Start:" + newNode.data);
			printLL();
		}
	}
	
	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
		} else if(length == 1) {
			head = null;
			tail = null;
			length--;
			System.out.println("Deleted first Node");
		}
		else {
			System.out.println("Deleted first Node");
			Node temp = head;
			head = temp.next;
			temp.next = null;
			length--;
			printLL();
		}
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
			length = 1;
			System.out.println("Enter Value at Last:" + newNode.data);
			printLL();
		} else {
			tail.next = newNode;
			tail = newNode;
			length++;
			System.out.println("Enter Value at Last:" + newNode.data);
			printLL();
		}
	}
	
	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
		} else if(length == 1) {
			head = null;
			tail = null;
			length--;
			System.out.println("Deleted first Node");
		} else {
			System.out.println("Deleted Last Node");
			Node temp = head;
			Node lastNode = head;
			while(temp.next != null) {
				lastNode = temp;
				temp = temp.next;
			}
			lastNode.next = null;
			tail = lastNode;
			length--;
			printLL();
		}
	}
	
	public void addNthPosition(int position, int value) {
		Node newNode = new Node(value);
		int count = 0;
		if (head == null) {
			head = newNode;
			tail = newNode;
			length = 1;
			System.out.println("Enter Value at 0 index, beacause list is empty:" + newNode.data);
			printLL();
		} else if( count <= position) {
			Node temp = head;
			while(temp.next != null && count < position-1) {
				count++;
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			length++;
			System.out.println("Enter Value at "+position+" index, is :" + newNode.data);
			printLL();
		}
	}
	
	public void deleteNthPosition(int position) {
		int count = 0;
		if (head == null) {
			System.out.println("List is empty");
		} else if (count == position) {
			deleteFirst();
		} else if (length == position) {
			deleteLast();
		}
		else if (count < position) {
			Node temp = head;
			Node last = head;
			while(temp.next != null && count < position) {
				count++;
				last = temp;
				temp = temp.next;
			}
			last.next = temp.next;
			temp.next = null;
			length--;
			printLL();
		}
	}
	
	public void printLL() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node temp = head;
			while(temp.next != null) {
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	public void displayTailNode() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node temp = tail;
			System.out.println("Tail node is "+ tail.data);
		}
	}

	public void getValueAtIndex(int index) {
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			int count = 0;
			Node temp = head;
			while(temp.next != null && count < index) {
				count++;
				temp = temp.next;
			}
			System.out.println("value At index : "+temp.data);
		}
	}
	
	public void reverseLL() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		}
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for(int i = 0; i < length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
		System.out.println("Reverse linked list");
		printLL();
	}
	
	public void reverseLL_withOutTail() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		}
		Node temp = head;
		Node before = null;
		while(temp != null) {
			Node after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
		head = before;
		System.out.println("Reverse linked list withOutTail");
		printLL();
	}
	
	public void reverseLLInRage(int left, int right){
		if (head == null) {
			System.out.println("LinkedList is empty");
		}
		Node dummy = new Node(0);
		dummy.next = head;
		for(int i = 0; i < left - 1; i++) {
			dummy = dummy.next;
		}
		Node start = dummy;
		
		Node current_node = start.next;
		for (int j = 0; j < right - left; j++) {
			Node after = current_node.next;
			current_node.next = after.next;
			after.next = start.next;
			start.next = after;
		}
		System.out.println("Reverse linked list from "+left+" to "+right );
		printLL();
	}
}
