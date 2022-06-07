

public class TreeNode extends Person {
	private TreeNode left;
	private TreeNode right;
	private TreeNode root;

	public TreeNode getRoot() {
		return root;
	}


	public void setRoot(TreeNode root) {
		this.root = root;
	}


	static int Value = mainWindow.totalScore;
	

	public TreeNode(int newElement) {
		super(getName(), Value);
		//just for initialize the element
		Value=newElement;
		left=null;
		right=null;
		root=null;
	}
	

	public static int getValue() {
		return Value;
	}


	public static void setValue(int value) {
		Value = value;
	}


	public TreeNode getLeft() {
		return left;
	}


	public void setLeft(TreeNode left) {
		this.left = left;
	}


	public TreeNode getRight() {
		return right;
	}


	public void setRight(TreeNode right) {
		this.right = right;
	}



}
