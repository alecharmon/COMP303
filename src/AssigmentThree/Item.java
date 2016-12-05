package AssigmentThree;

/**
 * Created by alec on 11/28/16.
 */
public abstract class Item {
    private String name;
    protected World world;
    protected int x,y;

    /**
     * Constructor of an item
     * the x and y are lazzly eval'd
     * @param name of token
     */
    public Item(String name){
        this.name = name;
    }

    /**
     * Constructor of an item with a refrence to the world they occupy
     * @param name of token
     * @param world reffrence
     */
    public Item(String name, World world){
        this.name = name;
        this.world = world;
    }

    /**
     * @return token
     */
    public String getToken(){
        return name;
    }

    /**
     * sets x of the item
     * @param x
     */
    protected void setX(int x) {
        this.x = x;
    }

    /**
     * sets y of the item
     * @param y
     */
    protected void setY(int y) {
        this.y = y;
    }
}
