
import java.util.Stack;

public class BinaryTree{

	public static TreeNode root;
	public static int size;

	public BinaryTree() {
		root=null;
		size=0;
	}

	public BinaryTree(TreeNode root,int size) {
		this.root=root;
		this.size=size;
	}

		private TreeNode createNewNode(int e) {
		return new TreeNode(e);
	}

		public boolean insert (int e) {
		if(root==null) {
		root=createNewNode(e); }
		else { 
			TreeNode parent=null;
			TreeNode current=root;
			while(current !=null) {
				if(e<current.getValue()) {
					parent=current; 
					current=current.getLeft();
				}
				else if(e>current.getValue()) {
					parent=current;
					current=current.getRight();
				}
				else
					return false;
			}
			if(e<parent.getValue()) 
				parent.setLeft(createNewNode(e));
			
			else if(e>parent.getValue())
				parent.setRight(createNewNode(e));
			
		}
		size++;
		return true;
		}


		public void inOrderWithoutRecursion() {
			Stack nodes = new Stack<>();
			TreeNode current=root;
		 while (!nodes.isEmpty() || current != null) { 
			if (current != null) { 
				nodes.push(current);
				current=current.getLeft(); 
			} 
			else { 
				TreeNode node = (TreeNode) nodes.pop();
				System.out.printf("%s ", node.getValue());
				current = node.getRight();
			} 
		} 
	}

		public static String print() {
			for (int i = 0; i < BinaryTree.size; i++) {
			  System.out.println(root.getValue());
		}
			 if (TreeNode.getValue()>= 0 && TreeNode.getValue() <= 33)
		            return "Begüm has bachelor's degree.\n"
		                    + "She has internship experience.\n"
		                    + "She can implement Java.\n";

		        if (TreeNode.getValue()>= 34 && TreeNode.getValue() <= 66)
		            return "Ecem has bachelor's degree.\n"
		                    + "She has internship experience.\n"
		                    + "She can implement Java.\n"  
		                    + "She has experience on HTML and CSS.\n"
		                    + "She can implement JavaScript.\n"
		                    + "She has experience on React.\n";

		        if (TreeNode.getValue() >= 67 && TreeNode.getValue() <= 100)
		            return "Alper has bachelor's degree.\n"
		                    + "He has internship experience.\n"
		                    + "He can implement Java.\n"
		                    + "He has experience on HTML and CSS.\n"
		                    + "He can implement JavaScript.\n"
		                    + "He has experience on React Native and Flutter.\n"
		                    + "He can implement Python.\n"
		                    + "He has experience on Project Management.\n"
		                    + "He has experience on using Jira and VSCode.";

		        return "";

	}
		
}
