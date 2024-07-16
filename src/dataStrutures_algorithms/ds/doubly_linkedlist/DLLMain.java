package dataStrutures_algorithms.ds.doubly_linkedlist;

public class DLLMain {

	public static void main(String[] args) {
		DLLOperations dll = new DLLOperations(1);
		
		dll.addFirst(2);
		dll.addFirst(3);
		
		
		dll.addLast(4);
		dll.addLast(5);
		
		dll.addAtnthPosition(2, 10);
		
		dll.getValueAtIndex(2);
		dll.setValueAtIndex(2,9);
		
		dll.removeLast();
		dll.removeFirst();
		
		dll.removeAtnthPosition(2);
		
	}

}
