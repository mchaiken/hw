import java.io.*;
import java.util.*;

public class io {

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
    public String read(String fileName){
	String ret="";
	try{
	BufferedReader reader = new BufferedReader(new FileReader(fileName));
	String line = null;

	
	    while ((line = reader.readLine()) != null) {
		ret+=line+ " ";
	    }
	}
	catch(Exception e){};
	return ret;
    }

    
	    
}
