import java.util.*;

public class RunningMedian{

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public RunningMedian(){
	maxHeap=new PriorityQueue<Integer>();
	minHeap=new PriorityQueue<Integer>();
      
    }

    public void add(int i){
	if (maxHeap.size() == 0){
	    maxHeap.add(i*-1);
	}
	else if (maxHeap.peek()*-1 >= i)
	    maxHeap.add(i*-1);
	else
	    minHeap.add(i);
	if (minHeap.size() > maxHeap.size()){
	    maxHeap.add(minHeap.remove()*-1);
	}
    }

    public Integer getMedian(){
	if (maxHeap.size()>minHeap.size())
	    return maxHeap.peek()*-1;
	else
	    return (maxHeap.peek()*-1 + minHeap.peek())/2;
    }

    public Integer removeMedian(){
	if (maxHeap.size()>minHeap.size())
	    return maxHeap.remove()*-1;
	else
	    return (maxHeap.remove()*-1 + minHeap.remove())/2;
    }

    public static void main(String[] args){
	RunningMedian me= new RunningMedian();
	me.add(0);
	me.add(5);
	me.add(3);
	me.add(17);
	me.add(18);
	me.add(2);
	me.add(20);
	System.out.println(me.maxHeap);
	System.out.println(me.minHeap);

	System.out.println(me.getMedian());
	System.out.println(me.removeMedian());

	System.out.println(me.maxHeap);
	System.out.println(me.minHeap);    
}
}