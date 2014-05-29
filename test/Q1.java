import java.io.*;
import java.util.*;
//I didn't write to a file sorry was going to do at end
public class Q1{
    public static int multDigits(int n){
    	int retNum=1;
	for(;n/10 != 0; n/=10){
	    retNum*=n%10;
	}
	retNum *=n;
	return retNum;
    }

    public static void getSingle(int n){
	while (n/10 != 0){
	    n=multDigits(n);
	    System.out.print(n+" ");
	}
	System.out.println();
    }



    public static void main(String[] args){
	System.out.println(multDigits(182222));
	System.out.print("What number?");
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	System.out.print("That becomes:");
	    getSingle(i);
    }
}