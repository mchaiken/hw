public class BinaryTree{
    private Node root;
    private Node dummy;

    public BinaryTree(int x){
	dummy=new Node(0);
	root=new Node(x);
	dummy.setRight(root);
	dummy.setLeft(root);
    }

    public int insert(int x){
	Node temp=dummy;
	Node temp2=root;
	while(temp2 != null){
	    if (temp2.getData(
}