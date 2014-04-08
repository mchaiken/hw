public class PancakeStack{
    
    private Node top;
    private int numElts;
    //constructor
    public PancakeStack(){
	top=null;
	numElts=0;
    }

    //push
    public void push(String s){
	Node n=new Node(s);
	n.setNext(top);
	top=n;
	numElts++;
    }
	

    //pop
    public String pop(){
	Node old = top;
	top=top.getNext();
	return old.getData();
	numElts--;
    }
 
    //peek
    public String peek(){
	return top.getData();
    }
    //isEmpty
    public boolean isEmpty(){
	return top == null;
    }
    
    public int getSize(){
	return numElts;
    }


    //toString
    public String toString(){
	String tmp="";
	Node currentNode = top;
	while(currentNode != null){
	    tmp+=currentNode.getData()+", ";
	    currentNode=currentNode.getNext();
	}
	return tmp;
    }


}