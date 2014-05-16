import java.util.*;

public class SpeedTest{
    private static ArrayList<Integer> testerNums;
    public static void printResults(double treeStart, double treeEnd, double hashStart, double hashEnd){
	System.out.println("hashMap start time:"+hashStart);
	System.out.println("hashMap end time:"+hashEnd);
	System.out.println("hashMap time elapsed:"+(hashEnd-hashStart));
	System.out.println();
	System.out.println("treeMap start time:"+treeStart);
	System.out.println("treeMap end time:"+treeEnd);
	System.out.println("treeMap time elapsed:"+(treeEnd-treeStart));
    }
    public static void main(String[] args){
	testerNums=new ArrayList<Integer>();
	for (int i=0; i<100; i++){
	    testerNums.add((int)(Math.random()*1000));
	}

	//Testing Adding a Value
	HashMap hashMap=new HashMap();
	double hashStart= System.nanoTime();
	for (Integer x:  testerNums){
	    hashMap.put(""+x,x);
	}
	double hashEnd=System.nanoTime();

	TreeMap treeMap=new TreeMap();
	double treeStart= System.nanoTime();
	for (Integer x:  testerNums){
	    treeMap.put(""+x,x);
	}
	double treeEnd=System.nanoTime();
	printResults(treeStart, treeEnd, hashStart, hashEnd);
	
	//GET
	 hashStart= System.nanoTime();
	for (Integer x:  testerNums){
	    System.out.print(hashMap.get(""+x)+" ");
	}
	 hashEnd=System.nanoTime();

	 treeStart= System.nanoTime();
	for (Integer x:  testerNums){
	    System.out.print(treeMap.get(""+x)+" ");
	}
	treeEnd=System.nanoTime();
	printResults(treeStart, treeEnd, hashStart, hashEnd);
	System.out.println();	System.out.println();
	//REMOVE
	hashStart= System.nanoTime();
	for (Integer x:  testerNums){
	    hashMap.remove(""+x);
	}
	 hashEnd=System.nanoTime();

	 treeStart= System.nanoTime();
	for (Integer x:  testerNums){
	    treeMap.remove(""+x);
	}
	 treeEnd=System.nanoTime();
	 System.out.println();System.out.println();
	 printResults(treeStart, treeEnd, hashStart, hashEnd);
	


	//HashMap is faster for insertion
	//HashMap is slightly faster for removal 
    }
}
       
