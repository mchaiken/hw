public class Heap{
    private int next;
    private int[] heap;

    public Heap(int l  ){
	heap=new int[l];
	next=0;
    }

    public void add(int a){
	heap[next]=a;
	for(int i=next; a >heap[a/2]; i/=2){
	}
	next++;
    }

    public int removeMax(){
	int temp=heap[0];
	heap[0]=heap[next-1];
	for(int i=1; heap[i]>heap[