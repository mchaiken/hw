import java.io.*;
import java.util.*;

public class Greetings{

    public void write(String fileName, String toWrite){
	PrintWriter out=null;
	try {
	    out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
	} 
	catch (Exception e){};

	out.print (toWrite);
	//out.println();
	out.close();
    }
    
    //Keyboard input
    //Scanner sc = new Scanner(System.in);
    //String i = sc.next();

    static int moos=0; 
    public class Cow{
	int pos;
	public Cow(int p){
	    pos=p;
	}
    }
    public static void oneTurn(String d, Cow c){
	if (d.equals("R")){
	    c.pos-=1;
	}
	else{
	    c.pos+=1;
	}
    }
 
    public static void same(Cow B, Cow E){
	if (B.pos == E.pos){
	    moos++;
	}
    }
	
    public void getGreetings(){
	ArrayList<String> moves= new ArrayList<String>();
	try{
	BufferedReader reader = new BufferedReader(new FileReader("greetings.in"));
	String line = null;	
	    while ((line = reader.readLine()) != null) {
		moves.add(line);
	    }
	}
	catch(Exception e){};

	Cow B= new Cow(Integer.parseInt(moves.get(0).substring(0,moves.get(0).indexOf(" "))));
	Cow E= new Cow(Integer.parseInt(moves.get(0).substring(moves.get(0).indexOf(" ")+1)));	       		       

	for (int i= 1; i<moves.size(); i++){
	    Cow C;
	    if (i%2  == 1){
		C=B;
	    }
	    else{
		C= E;
	    }
	    for(int x=0; x<Integer.parseInt(moves.get(i).substring(0,moves.get(i).indexOf(" "))); x++){
		oneTurn (moves.get(i).substring(moves.get(i).indexOf(" ")+1), C);
		same(B,E);
	    }
	}
	write("greetings.out", moos+"");
    }
	
    public static void main(String[] args){
	Greetings me= new Greetings();
	me.getGreetings();
    }
}