public class Driver{
    public static void main(String [] args){
	PancakeStack stack=new Pancake();
	stack.push("one");
	System.out.println(stack);
	stack.push("two");
	System.out.println(stack);
	stack.push("three");
	for(int x=0; x<20; x++){
	    stack.push(x+"");
	}
	System.out.println(stack);
	stack.pop();
	System.out.println(stack);
	stack.pop();
	System.out.println(stack);
    }
}