package dataStrutures_algorithms.ds.stack;

public class StackOperation {

	Node top;
	int height;
	
	public StackOperation(int value) {
		Node newNode = new Node(value);
		top = newNode;
		height = 1;
		printStack();
	}

	public void printStack() {
		if( top == null ) {
			System.out.println("Stack is empty");
		} else {
			Node temp = top;
			while( temp.next != null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
			System.out.println(temp.value);
			System.out.println();
		}
	}

	public void push(int value) {
		Node newNode = new Node(value);
		if( top == null) {
			top = newNode;
			height++;
		} else {
			newNode.next  = top;
			top = newNode;
			height++;
		}
		printStack();
	}

	public void pop() {
		if (top == null) {
			System.out.println("stack is empty");
		} else if(height == 1) {
			top = null;
			height = 0;
			printStack();
		} else {
			Node temp = top;
			top = top.next;
			temp.next = null;
			temp = null;
			height--;
			printStack();
		}
	}

}
