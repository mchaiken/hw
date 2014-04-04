public class MyStack{
    
    private Node top;

    //constructor
    public MyStack(){
	top=null;
    }

    //push
    public void push(String s){
	Node n=new Node(s);
	n.setNext(top);
	top=n;
    }
	

    //pop
    public String pop(){
	Node old = top;
	top=top.getNext();
	return old.getData();
    }
 
    //peek
    public String peek(){
	return top.getData();
    }
    //isEmpty
    public boolean isEmpty(){
	return top == null;
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