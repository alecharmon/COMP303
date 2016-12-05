package AssigmentThree;

/**
 * Created by alec on 12/1/16.
 */
public class Movable extends Item {

    /**
     * allows for customly named movable items
     * @param name
     * @param world
     */
    public Movable(String name, World world){
        super(name, world);
    }

    /**
     * creates default named movable items
     * @param world
     */
    public Movable(World world){
        super("M", world);
    }

    /**
     * given a direciton to move in, computes new x and y cords and calls the world method move
     * to move it, if successful update x and y
     * @param direction
     */
    public Boolean move(char direction){
        int newX = x;
        int newY = y;
        switch (direction){
            case 'S':
                newY += 1;
                break;
            case 'W':
                newX -= 1;
                break;
            case 'E':
                newX += 1;
                break;
            case 'N':
                newY -= 1;
                break;
        }
        if(world.isValidPosition(newX,newY)){
            Boolean success = world.move(x,y,newX,newY,direction);
            if( success ){
                this.setY(newY);
                this.setX(newX);
                return true;
            }

        }
        return false;
    }
}
