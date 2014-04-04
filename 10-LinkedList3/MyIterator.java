import java.util.*;

public class MyIterator<E> implements Iterator<E>{
    private Node<E> currentNode;

    public MyIterator<E>(Node<E> head){
	currentNode=head;
    }
    public boolean hasNext(){
	return (currentNode.getNext()!=null);
    }

    public E next(){
	Node ret= currentNode.getNext();
	currentNode=ret.getNext();
	return ret.getData();
    }

    public void remove(){
	currentNode=currentNode.getNext();
    }

    public static void main(String[]args){
	LinkedList L=new ListedList();
	L.add("one");
	L.add("two");
	L.add("three");

	MyIterator<String> i=i.iterator();
	while(i.hasNext()){
	    System.out.println(i.next());
	}
    }
}
	
