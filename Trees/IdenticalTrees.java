
class IdenticalTrees {

	Node root1, root2;
	public IdenticalTrees() {
		root1 = null;
		root2 = null;
	}
	
	public boolean isIdentical(Node a, Node b)
	{
		// 1. Both Empty
		if((null == a) && (null == b)) return true;

		//2. Both non empty.. compare
		if((null !=a) && (null !=b))
			return((a.key == b.key) 
					&& isIdentical(a.left, b.left) 
					&& isIdentical(a.right, b.right));
		
		//3. one is empty
		return false;
	}
	public static void main(String[] args) {
		
		IdenticalTrees trees = new IdenticalTrees();
		trees.root1 = new Node(1);
		trees.root1.left = new Node(2);
		trees.root1.right = new Node(3);
		trees.root1.left.left = new Node(4);
		trees.root1.left.right = new Node(5);
		trees.root1.right.left = new Node(6);
		trees.root1.right.right = new Node(7);

		trees.root2 = new Node(1);
		trees.root2.left = new Node(2);
		trees.root2.right = new Node(3);
		trees.root2.left.left = new Node(4);
		trees.root2.left.right = new Node(5);
		trees.root2.right.left = new Node(6);
		trees.root2.right.right = new Node(7);		
		
		if(trees.isIdentical(trees.root1, trees.root2))
			System.out.println("Trees identical");
		else
			System.out.println("Trees not identical");
	}

}
