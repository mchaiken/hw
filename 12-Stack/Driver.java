public class Driver{
    public static void main(String [] args){
	MyStack stack=new MyStack();
	stack.push("one");
	stack.push("two");
	stack.push("three");
	stack.pop();
	stack.pop();
	System.out.println(stack);
    }
}