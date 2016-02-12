public class Tree {

	Node root;
	
	Tree()
	{
		root = null;
	}
	
	public void inOrder(Node node)
	{
		if (node == null) return;
		
		inOrder(node.left);
		System.out.print(node.key + " ");
		inOrder(node.right);
	}
	
	public void preOrder(Node node)
	{
		if (node == null) return;
		
		System.out.print(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void postOrder(Node node)
	{
		if (node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key + " ");
	}
	
	void preOrder()
	{
		preOrder(root);
	}
	void inOrder()
	{
		inOrder(root);
	}
	void postOrder()
	{
		postOrder(root);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.root = new Node(1);
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		System.out.println("PreOrder");		tree.preOrder();
		System.out.println("\nInOrder");		tree.inOrder();
		System.out.println("\nPostOrder");	tree.postOrder();
	}

}

