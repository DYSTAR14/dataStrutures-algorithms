package dataStrutures_algorithms.algo.rbst;


public class RBSTMain {

	public static void main(String[] args) {
		//Normal BinarySearch Tree
		System.out.println("BinarySearch Tree");
		RBSTop op = new RBSTop();
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
		
		//Recursive BinarySearch Tree
		op.rInsert(47);
		System.out.println("Recursive BinarySearch Tree");
		System.out.println("27 :"+op.rContains(27));
		System.out.println(op.root.left.right.value);
		System.out.println("17 :"+op.rContains(17));
		
		
		RBSTop rop = new RBSTop();
		rop.rInsert(2);
		rop.rInsert(1);
		rop.rInsert(3);
		
		System.out.println(rop.root.value);
		System.out.println(rop.root.left.value);
		System.out.println(rop.root.right.value);
	}

}
