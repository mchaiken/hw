import info.gridworld.actor.Actor; 
import info.gridworld.actor.Critter; 
import info.gridworld.actor.Flower; 
import info.gridworld.grid.Location; 
import info.gridworld.grid.Grid; 
 
import java.util.ArrayList; 

public class Chameleonkid extends ChameleonCritter{
    public ArrayList<Actor> getActors() 
    { 
	ArrayList<Actor> actors = new ArrayList<Actor>(); 
	int[] dirs = 
	    { Location.AHEAD, Location.HALF_CIRCLE }; 
	for (Location loc : getLocationsInDirections(dirs)) 
	    { 
		Actor a = getGrid().get(loc); 
		if (a != null) 
		    actors.add(a); 
	    } 
 
	return actors; 

    }

}
   
   
   