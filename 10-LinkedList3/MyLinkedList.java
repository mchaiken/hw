public class MyLinkedList implements Iterable<String>{
    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(){
	head=new Node("0");
	tail=head;
    }
    public Node getHead(){
	return head;
    }

    public MyIterator<String> iterator(){
	return new MyIterator<String>(head);
	    }
    public void add(String s){
	Node temp=new Node(s);
	tail.setNext(temp);
	tail=temp;
	length++;
    }

    public String toString(){
	Node temp=head.getNext();
	String ret="[";
	while(temp != null){
	    ret+=temp.getData()+",";
	    temp=temp.getNext();
	}
	return ret+"]";
    }

    public void add(int i, String s){
	if (i==length){
	    add(s);
	}
	else{
	    Node temp=head;
	    for(int c=0;c<i;c++){
		temp=temp.getNext();
	    }
	    Node newN=new Node(s);
	    newN.setNext(temp.getNext());
	    temp.setNext(newN);
	    length++;
	}
    }

    public String get(int i){
	Node temp=head.getNext();
	for(int c=0;c<i;c++){
	    temp=temp.getNext();
	}
	return temp.getData();
    }

    public String set(int i, String s){
	Node temp=head;
	for(int c=0;c<i;c++){
	    temp=temp.getNext();
	}
	Node newN=new Node(s);
	Node old=temp.getNext();
	newN.setNext(old.getNext());
	temp.setNext(newN);
	if (i == length - 1){
	    tail = temp;
	}
	return old.getData();
    
    }

    public String remove(int i){
	Node temp=head;
	Node old;
	for(int c=0;c< i;c++){
	    temp=temp.getNext();
	}
	old=temp.getNext();
	temp.setNext(old.getNext());
	length--;
	if (i == length - 1){
	    tail = temp;
	}
	return old.getData();
    }

    public int find(String s){
	Node temp=head.getNext();
	int i=1;
	while(temp != null){
	    if (temp.getData().equals(s)){
		return i;
	    }
	    temp=temp.getNext();
	    i++;
	}
	return -1;
    }

    public int length(){
	return length;
    }


    public static void main(String[] args){
	MyLinkedList me=new MyLinkedList();
	for(int c = 0; c<10; c++){
	    System.out.println(me);
	    me.add((int)(Math.random()*10)+"");
	}
	System.out.println(me);
	System.out.println("get 8th index: "+me.get(8));
	System.out.println("set 0th index to 12: "+me.set(0,"12"));
	System.out.println(me);
	System.out.println("remove 0th index: "+me.remove(0));
	System.out.println(me);
	System.out.println("are there any 9s?: "+me.find("9"));
	System.out.println("how long?: "+me.length());
	me.add(3,"2");
	System.out.println("add a 2");
	System.out.println(me);
	me.add(10,"10");
	me.add("11");
	System.out.println(me);
    }
}