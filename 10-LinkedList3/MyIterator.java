public class MyIterator<E> implements Iterator<E>{
    private Node currentNode;

    public MyIterator<E> (Node head){
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
	MyLinkedList L=new MyListedList();
	L.add("one");
	L.add("two");
	L.add("three");

	MyIterator<String> i=i.iterator();
	while(i.hasNext()){
	    System.out.println(i.next());
	}
    }
}
	
