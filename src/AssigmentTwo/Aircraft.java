package AssigmentTwo;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by alec on 10/19/16.
 */
public class Aircraft {

    private Row [] rows = new Row[50];
    public ReentrantLock lock = new ReentrantLock();


    public Aircraft(){
        for(int i=0; i<rows.length; i++){
            rows[i] = new Row();
        }

    }

    /**
     * array list where strings represent "row_index:seat_index"
     * @return pick
     */
    public ArrayList<String> open_seats_by_row(){
        ReentrantLock lock = new ReentrantLock();
        lock.lock();

        ArrayList<String> to_ret = new ArrayList<String>();
        int i = 0;
        for ( Row r : rows){
            ArrayList<Integer> rows_open_seats = r.open_seats();
            for ( int s : rows_open_seats){
                to_ret.add(i+":"+s);
            }
            i++;

        }
        lock.unlock();
        return to_ret;
    }

    /**
     * reserves seat in a row
     * @param row_i row index
     * @param seat_i seat index
     * @param name name of reserver
     */
    public void reserve_seat(int row_i, int seat_i, String name){
        rows[row_i].reserve_seat(seat_i,name);
    }


    /**
     * prints the rows of the aircraft coupled with the index of that row
     */
    public void print(){
        String to_ret = "";
        int i = 0;
        for ( Row r : rows){
            System.out.println(to_ret + "Row:" + i + "  " + r.toString());
            i++;
        }
    }


}
