package AssigmentThree;
import java.util.Random;
/**
 * Created by alec on 11/28/16.
 */
public class Autonomous extends Moveable {
    private Random randomGenerator;
    private static char[] directions = {'N','W','E','S'};

    /**
     * default constructor
     * @param world
     */
    public Autonomous(World world){
        super("A", world);
    }

    /**
     * when called calls this instances move on a random direction
     */
    public void step(){
        randomGenerator = new Random();
        int x = randomGenerator.nextInt(4);
        this.move(directions[x]);
    }

}
/**/