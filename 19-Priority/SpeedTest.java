import java.util.*;

public class SpeedTest{
    private static ArrayList<Integer> testerNums;

    public static void main(String[] args){
	testerNums=new ArrayList<Integer>();
	for (int i=0; i<10; i++){
	    testerNums.add((int)(Math.random()*1000));
	}

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

	System.out.println("hashMap start time:"+hashStart);
	System.out.println("hashMap end time:"+hashEnd);
	System.out.println("hashMap time elapsed:"+(hashEnd-hashStart));
	System.out.println();
	System.out.println("treeMap start time:"+treeStart);
	System.out.println("treeMap end time:"+treeEnd);
	System.out.println("treeMap time elapsed:"+(treeEnd-treeStart));
	testerNums=new ArrayList<Integer>();
	for (int i=0; i<10; i++){
	    testerNums.add((int)(Math.random()*1000));
	}


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
	System.out.println("hashMap start time:"+hashStart);
	System.out.println("hashMap end time:"+hashEnd);
	System.out.println("hashMap time elapsed:"+(hashEnd-hashStart));
	System.out.println();

	System.out.println("treeMap start time:"+treeStart);
	System.out.println("treeMap end time:"+treeEnd);
	System.out.println("treeMap time elapsed:"+(treeEnd-treeStart));

	


	//HashMap is faster for insertion
	//HashMap is slightly faster for removal 
    }
}
       
