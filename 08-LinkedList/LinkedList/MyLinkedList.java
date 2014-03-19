public class MyLinkedList{
    private Node head;

    public MyLinkedList(){
	head=null;
    }

    public void add(String s){
	Node temp=new Node(s);
	temp.setNext(head);
	head=temp;	   
    }

    public String toString(){
	Node temp=head;
	String ret="[";
	while(temp != null){
	    ret+=temp.getData()+",";
	    temp=temp.getNext();
	}
	return ret+"]";
    }

    public void add(int i, String s){
	if (i==0){
	    add(s);
	}
	else{
	Node temp=head;
	for(int c=0;c<i-1;c++){
	    temp=temp.getNext();
	}
	Node newN=new Node(s);
	newN.setNext(temp.getNext());
	temp.setNext(newN);
	}
    }

    public String get(int i){
	Node temp=head;
	for(int c=0;c<i;c++){
	    temp=temp.getNext();
	}
	return temp.getData();
    }

    public String set(int i, String s){
	Node temp=head;
	for(int c=0;c<i-2;c++){
	    temp=temp.getNext();
	}
	Node newN=new Node(s);
	Node old=temp.getNext();
	newN.setNext(old.getNext());
	temp.setNext(newN);
	if (i==0){
	    head=newN;
	}
	return old.getData();
    
    }

    public String remove(int i){
	Node temp=head;
	Node old;
	if (i==0){
	    old=head;
	    head=head.getNext();
	}
	else{
	    for(int c=0;c<i-2;c++){
		temp=temp.getNext();
	    }
	    old=temp.getNext();
	    temp.setNext(old.getNext());
	}
	return old.getData();
    }

    public int find(String s){
	Node temp=head;
	int i=0;
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
	Node temp=head;
	int i=0;
	while(temp != null){
	    temp=temp.getNext();
	    i++;
	}
	return i;
    }


    public static void main(String[] args){
	MyLinkedList me=new MyLinkedList();
	for(int c = 0; c<10; c++){
	    me.add((int)(Math.random()*10)+"");
	}
	System.out.println(me);
	System.out.println("get 8th index: "+me.get(8));
	System.out.println("set 8th index to 12: "+me.set(0,"12"));
	System.out.println(me);
	System.out.println("remove 8th index: "+me.remove(8));
	System.out.println(me);
	System.out.println("are there any 9s?: "+me.find("9"));
	System.out.println("how long?: "+me.length());
	me.add(8,"2");
	System.out.println("add a 2");
	System.out.println(me);
    }
}