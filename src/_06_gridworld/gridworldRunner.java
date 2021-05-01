package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworldRunner {
	public static void main(String[] args) {
		World world = new World();
		Bug bug = new Bug();
		Location location = new Location(10, 5);
		world.show();
		world.add(location, bug);
		bug.getLocation();
		
	}
	
}
