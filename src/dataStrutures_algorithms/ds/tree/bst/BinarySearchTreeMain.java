package dataStrutures_algorithms.ds.tree.bst;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTreeOperations op = new BinarySearchTreeOperations();
		op.insert(47);
		op.insert(21);
		op.insert(76);
		op.insert(18);
		op.insert(52);
		op.insert(82);
		
		op.insert(27);
		
		System.out.println(op.root.left.right.value);
		
		System.out.println("27 :"+op.contains(27));
		
		System.out.println("17 :"+op.contains(17));
	}

}
