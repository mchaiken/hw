public class PancakeStack{
    
    private int top;
    private String[] pancakes;

    //constructor
    public PancakeStack(){
	pancakes=new String[10];
	top=-1;
    }

    //push
    public void push(String s){
	if (pancakes.length-1 <= top ){
	    String[]temp=new String[pancakes.length+10];
	    for(int x=0; x<pancakes.length;x++){
		temp[x]=pancakes[x];
	    }
	    pancakes=temp;
	}
	pancakes[top+1]=s;
	top++;
    }
	

    //pop
    public String pop(){
	String s=pancakes[top];
	pancakes[top]="";
	top--;
	return s;
    }
 
    //peek
    public String peek(){
	return pancakes[top];
    }
    //isEmpty
    public boolean isEmpty(){
	return top == -1;
    }

    //toString
    public String toString(){
	String tmp="";
	for(int x=top;x>-1;x--){
	    tmp+=pancakes[x]+", ";
	}
	return tmp;
    }


}