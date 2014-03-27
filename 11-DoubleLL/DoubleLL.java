public class DoubleLL<E>{
    private class Node<E>{
	E data;
	Node <E> next,prev;
	public Node(E d){
	    this.data=d;
	}
	public String toString(){
	    return ""+data;
	}
	public void setData(E d){
	    data=d;
	}
	public E getData(){
	    return data;
	}

	public void setNext(Node<E> n){
	    next=n;
	}

	public Node<E> getNext(){
	    return next;
	}
	public Node<E> getPrev(){
	    return prev;
	}
	public void getPrev(Node<E> n){
	    prev=n;
	}
    }
    private Node<E> current;

    private void insert(E d) {
	Node<E> n = new Node<E>(d);
	if (current == null) {
	    current = n;
	}
	else {
	    n.next = current;
	    n.prev=current.prev;
	    if(current.prev !=null){
		current.prev.next=n;
	    }
	    current.prev = n;
	    current = n;
	}
    }
    public E getCurrent() {
	return current.getData();
    }
    public void forward() {
	if (current.getNext() != null) {
	    current = current.getNext();
	}
    }
    public void back() {
	if (current.getPrev() != null) {
	    current = current.getPrev();
	}
    }
    public String toString() {
	if (current == null) {
	    return "";
	}
	Node<E> temp = current;
	while (temp.getPrev() != null) {
	    temp = temp.getPrev();
	}

	String s = "";
	while (temp != null) {
	    s = s + temp.getData() + " ";
	    temp = temp.getNext();
	}
	return s;
    }
    public static void main(String[] args) {
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("Hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	//first test up to here	

	System.out.println("current: "+L.getCurrent());
	L.forward();	
	System.out.println("current: "+L.getCurrent());

	L.insert("inserted");
	L.forward();
	System.out.println(L);

    }
}
