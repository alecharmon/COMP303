package AssigmentOne;
import java.util.*;


public class Queue {
    private ArrayList<Student> queue = new ArrayList<Student>();

    public Queue (){
    }

    public static void main(String[] args) {
        Student s  =  new Student("alec harmon", 16, "22765" );
        Student s_1  =  new Student("scott", 16, "22765" );
        Student s_2  =  new Student("april", 16, "22765" );
        Student s_3  =  new Student("dylan", 16, "22765" );
        Queue q = new Queue();
        q.enqueue(s);
        q.enqueue(s_1);
        q.enqueue(s_2);
        q.enqueue(s_3);
        System.out.println(q.dequeue().name);
        System.out.println(q.dequeue().name);
        System.out.println(q.dequeue().name);
        System.out.println(q.dequeue().name);
    }

    private void enqueue (Student s){
        queue.add(0, s);
    }

    private Student dequeue (){
        if (queue.size() == 0){
            throw new RuntimeException ( "No Students in Queue" );
        }
        else{
            Student first_in_line = queue.get(queue.size() - 1);
            queue.remove(first_in_line);
            return first_in_line;

        }
    }
}
