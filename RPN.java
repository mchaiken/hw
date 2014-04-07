import java.util.*;

public class RPN{
  private PancakeStack stack;
  private static final String opperators="*/+-";
  private boolean on? = false;
  
  
  public void calculate(){
    on? = true;
    while (on?){
      System.out.print("Type and hit Enter:");
      Scanner sc = new Scanner(System.in);
      String input=sc.nextLine();
      if(input.equals("off")){
        on?=false;
      }
      else if(input.equals("clear")){
        stack=new PancakeStack();
      }
      else if(opperators.indexOf(input) ==-1){
          stack.push(index);
      }
      else{
        System.out.println(opperate(input));
      }
    }
  }
  
  public double opperate(String op){
    double b=Double.parseDouble(stack.pop());
    double a=Double.parseDouble(stack.pop());
    double ret=0;
    if(op.equals("*")){
      ret=a*b;
    }
    else if(op.equals("/")){
      ret=a/b;
    }
    
    else if(op.equals("+")){
      ret=a+b;
    }
    else if(op.equals("-")){
      ret=a-b;
    }
    stack.push(ret);
    return ret;
  }
  public static void main(String[]args){
    RPN Z=new RPN();
    Z.calculate();
    System.out.println(stack);
  }
}

  
