import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
World world = new World(); 
Bug bug = new Bug(); 
bug.setColor(Color.blue);
bug.turn();
Bug bug2 = new Bug();
bug2.setColor(Color.cyan);
for(int i = 0; i < 70; i++) {
	Flower f = new Flower(); 
	Location location2 = new Location(new Random().nextInt(10), new Random().nextInt(10));
	world.add(location2, f);
	
}
Flower flower = new Flower();
Flower flower2 = new Flower(); 
Location location = new Location(4, 6); 
Location f1 = new Location(4,7);
Location f2 = new Location(4, 5); 
world.show();
world.add(location, bug);
Location location3 = new Location(new Random().nextInt(10), new Random().nextInt(10));
world.add(f1, flower);
world.add(f2, flower2);
world.add(location3, bug2);

}



}
