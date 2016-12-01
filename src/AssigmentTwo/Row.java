package AssigmentTwo;
import java.util.ArrayList;

public class Row {

    private Seat [] seats  = new Seat[4];

    public Row(){
        for(int i=0; i<seats.length; i++){
            seats[i] = new Seat();
        }
    }

    public static void main(String[] args) {
        Row a = new Row();
        System.out.print(a);
    }

    /**
     * return the indexes of the open seats in the row
     * @return an arraylist of open seat where value is index
     */
    public synchronized ArrayList<Integer> open_seats(){
        ArrayList<Integer> to_ret = new ArrayList<Integer>();
        int i = 0;
        for( Seat s : seats ){
            if (!s.is_reserved()){
                to_ret.add(i);
            }
            i++;

        }
        return to_ret;
    }

    /**
     * reserves the seat in the row
     * @param i index of seat in row
     * @param name id of the agent booking
     */
    public void reserve_seat(int i, String name){
        seats[i].reserve(name);
    }

    /**
     * option 2 - print the row,
     * _ where seat open,
     * seat reserver name otherwise
     * @return string to represnt row
     */
    public String toString(){
        String to_ret = "";

        for( int i = 0 ; i< seats.length; i++ ){
            to_ret += " "+seats[i].toString();
            if (i == 1){
                to_ret += "    ";
            }

        }
        return to_ret;

    }




}
