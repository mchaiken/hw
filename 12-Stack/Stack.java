public class Stack <E> {
    private Shelf<E> top;
    
    public Stack (){
	top= new Shelf<E>(null);
    }

    public Shelf<E> push(E nD){
	Shelf<E> n=new Shelf(nD);
	n.setDown(top.getDown());
	top.setDown(n);
	return n;
    }

    public Shelf<E> pop(){
	Shelf<E> old=top.getDown();
	top.setDown(old.getDown());
	return old;
    }
    
    public String toString(){
	Shelf<E> temp=top.getDown();
	String ret="";
	while (temp !=null){
	    ret+=temp.getData()+"->";
	    temp=temp.getDown();
	}
	return ret;
    }
    public Shelf<E> peek(){
	return top.getDown();
    }
    public class Shelf<E>{
	private E data;
	private Shelf<E> down;
	
	public Shelf (E _data){
	    data=_data;
	}

	public E getData(){return data;}
	public Shelf<E> getDown(){return down;}

	public E setData(E _data){ 
	    E oldD=data;
	    data=_data;
	    return oldD;
	}

	public Shelf<E> setDown(Shelf<E> next){
	    Shelf<E> oldD=down;
	    down=next;
	    return oldD;
	}
    }

    public static void main(String[]args){
	Stack<Integer> me=new Stack<Integer>();
	for(int x=0;x<=20;x++){
	    me.push( x );
	}
	System.out.println(me);
	for(int x=0;x<=20;x++){
	    System.out.println(me.pop().getData());
	    System.out.println(me);
	}
    }
}
	