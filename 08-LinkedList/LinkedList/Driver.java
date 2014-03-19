public class Driver{
    public static void main(String[]args){
	
	Node n1=new Node("Doctor");
	Node n2=new Node("Amy");
        n2.setNext(new Node ("Rory"));
	MyLinkedList me=new MyLinkedList();
	me.add("Rory");
	me.add("Amy");
	me.add("Doctor");
	System.out.println(me);
    }
}


	