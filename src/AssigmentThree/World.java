package AssigmentThree;
import java.util.*;

/**
 * Created by alec on 11/28/16.
 */
public class World {
    private Item[][] store;
    private Autonomous[] automatas;
    private int height;
    private int width;
    private Random randomGenerator;

    /**
     * Constructor for the world
     * @param height of world
     * @param width of world
     * @param agentsQty # of diffrent agents
     */
    public World(int height, int width, int agentsQty) {
//        if (height*width > agentsQty*3){
//            throw new RuntimeException ( "Area insufficiant for given qty of agents" );
//        }
        this.height = height;
        this.width = width;
        this.store = new Item[height][width];
        this.automatas = new Autonomous[agentsQty];
        for(int i =0 ; i < agentsQty; i++){
            Autonomous a = new Autonomous(this);
            this.add(new Immovable());
            this.add(new Movable(this));
            this.add(a);
            this.automatas[i] = a;
        }
    }

    /**
     * Construct a main method that builds a world and then runs a simulation for 100 iterations.
     * @param args
     */
    public static void main(String[] args){
        World w = new World(3, 3, 2);
        System.out.println("Init Display:");
        w.display();
        for (int i=1; i<101; i++){
            System.out.println(i+" Display:");
            w.step();
            w.display();
        }
    }

    /**
     * aggregator for all of our automatas
     */
    public void step(){
        for( Autonomous a: automatas){
            a.step();
        }
    }

    /**
     * randomly picks a location on the world to add a new item
     * if that spot is ocupied keep on picking a new location until
     * an open space is found
     * @param item to be added
     */
    private void add(Item item){
        randomGenerator = new Random();
        int x = randomGenerator.nextInt(this.width);
        int y = randomGenerator.nextInt(this.height);
        Item loc =  this.store[y][x];
        while( loc != null){
            x = randomGenerator.nextInt(this.width);
            y = randomGenerator.nextInt(this.height);
            loc =  this.store[y][x];
        }
        item.setX(x);
        item.setY(y);
        this.store[y][x] = item;
    }

    /**
     * moves the object in the array from current cords to the old cords
     * if new cords are ocupied move the item in the direction specified, this is a rec behavior
     * @param x current pos
     * @param y current pos
     * @param newX cordinate to be placed
     * @param newY cordinate to be placed
     * @param direction in whcich the move occures
     * @return fn has to be successful: true if successful: false if otherwise
     */
    public Boolean move(int x, int y, int newX, int newY, char direction){
        Item dest = store[newY][newX];
        // if something is trying to move into a new space swap it with null
        if (dest == null){
            Item temp = store[y][x];
            store[y][x] = null;
            store[newY][newX] = temp;
            return true;
        }
        else{
            //If the item in the space is not movable try to move it
            if( dest instanceof Movable){
                Movable toMove = (Movable) dest;
                Boolean success = toMove.move(direction);
                if (success){
                    store[newY][newX] = store[y][x];
                    store[y][x] = null;
                    return true;
                }
            }
            return false;

        }
    }

    /**
     * makes sure we dont try to ove anyhting out side the world
     * @param x pos
     * @param y pos
     * @return valid position on the world
     */
    public Boolean isValidPosition(int x, int y){
        Boolean bottom,left,right,top;
        top = (height > y );
        bottom = (y > -1);
        left = (x > -1);
        right = (width > x);
        return bottom && left && right && top;
    }

    /**
     * prints all items in their place and a '_' if the position is empty
     */
    public void display(){
        String toPrint = "";
        for ( Item[] row : this.store){
            for (Item value: row){
                try {
                    toPrint+= value.getToken();
                }
                catch (NullPointerException e){
                    toPrint+= "_";
                }

            }
            System.out.println(toPrint);
            toPrint = "";
        }
    }
}
