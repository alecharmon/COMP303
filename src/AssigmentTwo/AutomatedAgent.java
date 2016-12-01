package AssigmentTwo;
import java.util.ArrayList;
import java.util.Random;

public class AutomatedAgent extends HumanAgent {
    private final String name;
    private final Aircraft aircraft;
    private Random randomGenerator;

    public AutomatedAgent(String agent_name, Aircraft agent_aircraft){
        super(agent_name, agent_aircraft);
        name = agent_name;
        aircraft = agent_aircraft;
        randomGenerator = new Random();
    }

    /**
     * A random and automated approach to register seats
     * @return true if successully registered, false if their are no seats left
     */
    public boolean register_seat(){
        ArrayList<String> open_seats = aircraft.open_seats_by_row();

        if (open_seats.size() == 0){
            return false;
        }
        int index = randomGenerator.nextInt(open_seats.size());
        String open_seat = open_seats.get(index);
        String[] open_seat_parts = open_seat.split(":");
        int row_i = Integer.parseInt(open_seat_parts[0]);
        int seat_i = Integer.parseInt(open_seat_parts[1]);
        aircraft.reserve_seat(row_i,seat_i,name);
        System.out.println("Agent "+name+ ": registered row "+row_i+" seat "+ seat_i);
        return true;
    }

}
