package AssigmentTwo;

public class AssignmentTester {

    /**
     * main method tests the assignment based on paramaters posed in the question
     * @param args cli args
     */
    public static void main(String[] args) {
        Aircraft a = new Aircraft();

        AutomatedAgent a1 = new AutomatedAgent("1",a);
        AutomatedAgent a2 = new AutomatedAgent("2",a);

        HumanAgent a3 = new HumanAgent("H",a);

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        Thread t3 = new Thread(a3);

        t2.start();
        t1.start();

        t3.start();
    }
}
