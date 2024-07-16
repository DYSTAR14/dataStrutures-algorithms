package dataStrutures_algorithms.algo.rbst;

public class RBSTop {
	
Node root;
	
	public boolean insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return true;
		} else {
			Node temp  = root;
			while(true) {
				if(newNode.value == temp.value) {
					return false;
				}
				if(newNode.value < temp.value) {
					if(temp.left == null) {
						temp.left = newNode;
						return true;
					}
					temp = temp.left;
				} else {
					if(temp.right == null) {
						temp.right = newNode;
						return true;
					}
					temp = temp.right;
				}
			}
		}
	}
	
	public boolean contains(int value) {
		Node temp = root;
		while(temp != null) {
			if (value < temp.value) {
				temp = temp.left;
			} else if(value > temp.value) {
				temp = temp.right;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean rContains(int value) {
		return rContains(root, value);
	}

	private boolean rContains(Node currentNode, int value) {
		if (currentNode == null) {
			return false;
		}
		if (currentNode.value == value) {
			return true;
		}
		if (value < currentNode.value) {
			return rContains(currentNode.left, value);
		} else  {
			return rContains(currentNode.right, value);
		} 
	}

	public void rInsert(int value) {
		if (root == null) {
			root = new Node(value);
		}
		rInsert(root, value);
	}

	private Node rInsert(Node currentNode, int value) {
		if(currentNode == null ) {
			return new Node(value);
		}
		if(value < currentNode.value) {
			currentNode.left = rInsert(currentNode.left, value);
		} else if(value > currentNode.value) {
			currentNode.right = rInsert(currentNode.right, value);
		}
		return currentNode;
	} 

}
