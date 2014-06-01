import java.io.*;
import java.util.*;

public class Ctiming {

    
    public static void write(String fileName, String toWrite){
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
    public static String read(String fileName){
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

    public static void getTime(){
	String ret= read("ctiming.in");
	//System.out.println(ret.substring(0,ret.indexOf(" "))+"|");
	int day= Integer.parseInt(ret.substring(0,ret.indexOf(" ")));
	ret=ret.substring(ret.indexOf(" ")+1);
	int hour=Integer.parseInt(ret.substring(0,ret.indexOf(" ")));
	int min=Integer.parseInt(ret.substring(ret.indexOf(" ")+1,ret.length()-1));
	
        int days= day-11;
	int hours= hour-11 + (days*24);
	int mins=min-11 + (hours*60);
	write("ctiming.out", mins+"");
    }

    public static void main(String[] args){
	getTime();
    }
	
	


}