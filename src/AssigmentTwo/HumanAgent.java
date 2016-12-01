package AssigmentTwo;
import java.util.ArrayList;
import java.util.Scanner;

public class HumanAgent  implements Runnable {


    private final String name;
    private final Aircraft aircraft;
    private static final int DELAY = 100;

    public HumanAgent(String agent_name, Aircraft agent_aircraft) {
        name = agent_name;
        aircraft = agent_aircraft;
    }


    /**
     * registers a seat based on user input
     * @return true if successully registered, false if their are no seats left
     */
    public boolean register_seat(){
        System.out.println("Bellow is the most recent update of available seats");
        aircraft.print();
        ArrayList<String> open_seats = aircraft.open_seats_by_row();

        if (open_seats.size() == 0){
            return false;
        }

        while (true) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Enter a Row index: ");
            int row_i = reader.nextInt();

            System.out.println("Enter a Seat index: ");
            int seat_i = reader.nextInt();

            String seat_selction = row_i + ":" + seat_i;


            if (open_seats.contains(seat_selction)) {
                aircraft.reserve_seat(row_i, seat_i, name);
                return true;
            } else {
                System.out.println("That was not a valid selection, please Enter a valid selection");
            }
        }
    }


    /**
     * Concurrent run method,
     * obtains a lock of the airplane obj and tries to register seats while it is not full
     * on completion it prints out to the console that the agent is done
     */
    public void run(){
        boolean seats_reamining = true;
        try {
            while(seats_reamining) try {
                aircraft.lock.lock();
                seats_reamining = register_seat();

            } finally {
                aircraft.lock.unlock();
                Thread.sleep(DELAY);
            }
            System.out.println("Agent " + name + " cant register any more seats");

        }
        catch (InterruptedException e){
            System.out.println("Agent " + name + " exxperininced an innteruption");
        }
    }
}
