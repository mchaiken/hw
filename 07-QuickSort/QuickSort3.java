import java.util.Arrays;
import java.util.Random;

public class QuickSort3{

    public int partition(int[]a,int l, int r){ 
	//System.out.println(Arrays.toString(a));
	int pivot;
	if (a[0]>a[a.length-1] && a[0]<a[a.length/2])
	    pivot=0;
	else if(a[0]<a[a.length-1] && a[a.length-1]<a[a.length/2])
	   pivot=a.length-1;
	else
	    pivot=a.length/2;
	//System.out.println(pivot);
	int temp=a[r];
	int wall=l;
	a[r]=a[pivot];
	a[pivot]=temp;
	for(int i=l;i<=r;i++){
	    if(a[i] < a[r]){
		temp=a[wall];
		a[wall]=a[i];
		a[i]=temp;
		wall++;
	    }
	}	
	temp=a[wall];
	a[wall]=a[r];
	a[r]=temp;
	return wall;

    }
    
    public void qSort(int[]a,int lo, int hi){
	if (lo < hi){
	    int pivot=partition(a,lo,hi);
	    qSort(a,pivot+1,hi);
	    qSort(a,lo,pivot-1);

	}
    }
	


    public static void main(String[] args){
	Random r = new Random();
	int[] test = new int[10];
	for(int i = 0;i<test.length;i++){
	    test[i] = r.nextInt(100);
	}
	QuickSort3 me = new QuickSort3();
	me.qSort(test,0,test.length - 1);
	System.out.println(Arrays.toString(test));
    }
}