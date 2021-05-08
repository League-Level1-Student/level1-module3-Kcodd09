package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworldRunner {
	public static void main(String[] args) {
		World<Actor> world = new World<Actor>();
		Random ranX = new Random();
		Random ranY = new Random();
		Color color = new Color(255);
		int x = ranX.nextInt(10);
		int y = ranY.nextInt(10);
		Bug bug = new Bug();
		Bug bug2 = new Bug();
		Flower flower = new Flower();
		Location location = new Location(1, 5);
		Location loc = new Location(0,0);
		Location ranLoc = new Location(x, y);
		world.show();
		world.add(location, bug);
		world.add(ranLoc, bug2);
		bug2.setColor(color);
		bug.turn();
		bug.turn();
		world.add(loc, flower);
		for (int i = 0; i < 97; i++) {
			world.add(world.getRandomEmptyLocation(), flower);
		}
		
	}
	
}
