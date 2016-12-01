package AssigmentTwo;
public class Seat {

    private boolean reserved;
    private String reserved_by;

    public Seat(){
        reserved = false;
    }

    public static void main(String[] args) {
        Seat a = new Seat();
        System.out.print(a);
    }

    /**
     * @returns true if seat is reserved
     */
    public boolean is_reserved(){
        return reserved;
    }

    /**
     * @returns the string of who reserved the seat
     */
    public String reserved_by(){
        return reserved_by;
    }

    /**
     * @returns true if seat is reserved
     */
    public void reserve(String name){
        if(reserved){
            throw new RuntimeException ("cant reserve a seat that is alread reserved") ;
        }
        else{
            reserved = true;
            reserved_by = name;
        }
    }

    /**
     * @returns string representation of whom reserved the seat, '_' otherwise
     */
    public String toString(){
        if (this.is_reserved()){
            return this.reserved_by();
        }
        else{
            return "_";
        }
    }

}
