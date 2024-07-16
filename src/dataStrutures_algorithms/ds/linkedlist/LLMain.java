package dataStrutures_algorithms.ds.linkedlist;

public class LLMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLOperations list = new LLOperations();
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		list.addFirst(6);
		
		
		list.displayTailNode();
		
		list.addLast(45);
		list.addLast(46);
		
		
		list.addFirst(98);
		
		
		list.addNthPosition(3, 999);
		
		
		list.deleteFirst();
		
		list.deleteLast();
		
		list.deleteNthPosition(0);
		
		list.getValueAtIndex(0);
		
		list.reverseLL();
		
		list.reverseLL_withOutTail();
		
		list.reverseLLInRage(4, 5);
		
	}

}
