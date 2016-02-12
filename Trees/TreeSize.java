
class TreeSize {

	private Node root;
	
	TreeSize()
	{
		root = null;
	}
	
	public int getTreeSize(Node node)
	{
		if(node == null) return 0;
		else return (getTreeSize(node.left) + 1 + getTreeSize(node.right));
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSize tree = new TreeSize();
		tree.root = new Node(1);
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		System.out.println("tree Size=" + tree.getTreeSize(tree.root));
	}

}
