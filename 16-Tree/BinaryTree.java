public class BinaryTree{
    private Node root;

    public BinaryTree(int x){
	root=new Node(Integer.MIN_VALUE);
	root.setLeft(new Node(x));
    }

    public void insert(int x){
	Node temp=root.getLeft();
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
	Node temp=root.getLeft();
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
	    return search(x, c.getRight());
	}
    }

    public void delete(Node target){
	Node cur = root.getLeft();
	Node piggy=null;
	while(cur.getData() != target.getData() && cur!= null){
	    piggy=cur;
	    if(cur.getData() > target.getData()){
		cur=cur.getLeft();
	    }
	    else{
		cur=cur.getRight();
	    }
	}
	if (cur != null){
	    if (cur.getLeft() == null){
		if (piggy.getData() > cur.getData()){
		    piggy.setLeft(cur.getRight());
		}
		else if (piggy.getData() < cur.getData()){
		    piggy.setRight(cur.getRight());
		}
		
	    }
	    else if(cur.getRight() == null){
		if (piggy.getData() > cur.getData()){
		    piggy.setLeft(cur.getLeft());
		}
		else if (piggy.getData() < cur.getData()){
		    piggy.setRight(cur.getLeft());

		}
	    }
	    else{
		Node replace= cur.getRight();
		while(replace.getLeft() != null){
		    replace=replace.getLeft();	   
		}
		int temp= replace.getData();
		delete(replace);
		cur.setData(temp);
	    }
	}
    }
		    
	    
    public String  print(Node temp){
	if(temp!=null){
	    return temp.getData()+" "+print(temp.getLeft())+" "+print(temp.getRight());
	}
	return "";
    }

    public String  print(){
	return print(root.getLeft());
    }
		

    public String toString(Node temp){
	if (temp != null){
	    return temp.getData() +" R of "+temp.getData()+" is " + toString(temp.getRight())+ "L of "+temp.getData()+ " is " + toString(temp.getLeft());
	}
	return "nothing ";
    }
    public String toString(){
	return toString(root.getLeft());
    }



    public static void main(String[] args){
	BinaryTree me = new BinaryTree(15);
	me.insert(10);
	me.insert(20);
	me.insert(12);
	me.insert(5);
	me.insert(2);

	me.insert(17);
	me.insert(16);
	me.insert(18);
	me.insert(25);
	me.insert(22);
	me.insert(30);
	me.insert(26);
	me.insert(28);

	System.out.println(me +"\n");
	me.delete(new Node(2));
	me.delete(new Node(5));
	me.delete(new Node(25));
	System.out.println(me.print());
    }
	
}