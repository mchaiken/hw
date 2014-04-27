public class BinaryTree{
    private Node root;

    public BinaryTree(int x){
	root=new Node(x);

    }

    public void insert(int x){
	Node temp=root;
	Node temp2;
	while(temp != null){
	    temp2= temp;
	    if (temp2.getData() > x){
		temp=temp.getLeft();
		if (temp==null)
		    temp2.setLeft(new Node(x));
	    }
	    else if(temp2.getData()<x){
		temp=temp.getRight();
		if (temp==null)
		    temp2.setRight(new Node(x));
	    }
	}
    }

    public Node search(int x){
	Node temp=root;
	while(temp != null && temp.getData() != x){
	    if (temp.getData() > x){
		temp=temp.getLeft();
	    }
	    else if(temp.getData()<x){
		temp=temp.getRight();
	    }
	}
	return temp;
    }


    public Node search (int x, Node c){
	if (c== null || c.getData() == x)
	    return c;
	else if (c.getData() > x)
	    return search(x, c.getLeft());
	else{
	    return search(x, c.getRight()):
	}
    }

    public String toString(Node temp){
	if (temp != null){
	    return temp.getData() +" R of "+temp.getData()+" is " + toString(temp.getRight())+ "L of "+temp.getData()+ " is " + toString(temp.getLeft());
	}
	return "nothing ";
    }
    public String toString(){
	return toString(root);
    }



    public static void main(String[] args){
	BinaryTree me = new BinaryTree(100);
	me.insert(150);
	me.insert(50);
	me.insert(10);
	me.insert(75);
	System.out.println(me);
    }
	
}