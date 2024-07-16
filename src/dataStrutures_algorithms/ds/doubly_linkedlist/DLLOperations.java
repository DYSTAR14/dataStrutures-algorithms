package dataStrutures_algorithms.ds.doubly_linkedlist;

public class DLLOperations {

	Node head;
	Node tail;
	int length;
	
	public DLLOperations(int data) {
		Node newNode = new Node(data);
		head = newNode;
		tail = newNode;
		length = 1;
		printDll();
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null && length == 0) {
			head = newNode;
			tail = newNode;
			length = 1;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			length++;
		}
		printDll();
	}
	
	public void removeFirst() {
		if (head == null && length == 0 ) {
			System.out.println("DLL is empty");
		}else if(length == 1){
			head = null;
			tail = null;
			length--;
		}
		else {
			Node temp = head;
			head = head.next;
			head.prev = null;  
			temp.next = null;
			length--;
		}
		printDll();
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null && length == 0) {
			head = newNode;
			tail = newNode;
			length = 1;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			length++;
		}
		printDll();
	}
	
	public void removeLast() {
		if (head == null && length == 0 ) {
			System.out.println("DLL is empty");
		} else if(length == 1){
			head = null;
			tail = null;
			length--;
		} else {
			Node temp = tail;
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
			length--; 
		} 
		printDll();
	}
	
	public void addAtnthPosition(int position, int data) {
		Node newNode = new Node(data);
		if (head == null && length == 0) {
			head = newNode;
			tail = newNode;
			length = 1;
		} else {
			Node after = head;
			Node before = head;
			int count = 0;
			while(after.next != null && count < position ) {
				count++;
				before = after;
				after = after.next;
			}
			before.next = newNode;
			newNode.prev = before;
			newNode.next = after;
			after.prev = newNode;
			length++;
		}
		printDll();
		
	}
	
	public void removeAtnthPosition(int position) {
		if(position < 0 || position >= length) {
			System.out.println("for index "+position+" value not present");
		} else if(position == 0) {
			removeFirst();
		} else if(position == length) {
			removeLast();
		} else {
			int count = 0;
			Node temp = head;
			while(temp.next != null && count < position) {
				temp = temp.next;
				count++;
			}
			temp.next.prev = temp.prev;
			temp.prev.next = temp.next;
			temp.prev = null;
			temp.next = null;
			length--;
		}
		printDll();
	}
	
	public void getValueAtIndex(int index) {
		if (head == null && length == 0) {
			System.out.println("List is empty");
		} else if(length == 1) {
			System.out.println("Value At index:"+index+" is "+head.data);
		} else {
			int count = 0;
			Node temp = head;
			while(temp.next != null && count < index) {
				temp = temp.next;
				count++;
			}
			System.out.println("Value At index:"+index+" is "+temp.data);
		}
	}
	
	public void setValueAtIndex(int index, int value) {
		if (head == null && length == 0) {
			System.out.println("List is empty");
		} else if(length == 1) {
			System.out.println("Value At index:"+index+" is "+head.data);
		} else {
			int count = 0;
			Node temp = head;
			while(temp.next != null && count < index) {
				temp = temp.next;
				count++;
			}
			temp.data = value;
			System.out.println("Value At index:"+index+" is "+temp.data);
		}
		printDll();
	}

	public void printDll() {
		if (head == null && length == 0) {
			System.out.println("List is empty");
		} else {
			Node temp = head;
			for( int i = 0; i < length ; i++) {
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
