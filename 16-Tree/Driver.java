public class Driver{

    public static void main(String[]args){
	Node root=new Node(1);
	root.setData(0);
	root.setLeft(new Node(1));
	root.setRight(new Node(2));
	System.out.println(root.getData());
	System.out.println(root.getLeft().getData()+" "+root.getRight().getData());
    }
}
