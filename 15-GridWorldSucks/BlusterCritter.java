 import info.gridworld.actor.Actor; 
import info.gridworld.actor.Rock; 
import info.gridworld.actor.Critter; 
 
import info.gridworld.grid.Location; 
 
import java.util.ArrayList; 
import java.awt.Color; 


public class BlusterCritter extends Critter{
    private int c;


    public BlusterCritter(int courage){
	super();
	c=courage;
    }


    public void processActors(ArrayList<Actor> actors)
    {
	Color co = getColor();
	if (actors.size() > c){

	 
	    int red = (int) (co.getRed()-1);
	    int green = (int) (co.getGreen()-1);
	    int blue = (int) (co.getBlue() -1);
	    if (red+blue+green >=0)
		setColor(new Color(red, green, blue));
	}
	else{
	   
	    int red = (int) (co.getRed()+1);
	    int green = (int) (co.getGreen()+1);
	    int blue = (int) (co.getBlue() +1);
	    if (red+blue+green <=255)
		setColor(new Color(red, green, blue));
	}
    }

   public ArrayList<Actor> getActors()
    {
	ArrayList<Actor> ret= getGrid().getNeighbors(getLocation());
	ArrayList<Actor> stat= getGrid().getNeighbors(getLocation());
	for (Actor a: stat){
	    ArrayList<Actor> temp= getGrid().getNeighbors(a.getLocation());
	    for(Actor a2: temp){
		if(ret.indexOf(a2) == -1 && a2!= this) 
		    ret.add(a2);
	    }
	}
	return ret;
    }




}
