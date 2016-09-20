package AssigmentOne;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    public String name;
    private int    age;
    private String studentid;

    public Student (String input_name, int input_age, String input_studentid){
      validate_name(input_name);
      validate_age(input_age);
      validate_studentid(input_studentid);
      name      = input_name;
      age       = input_age;
      studentid = input_studentid;
    }

    public static void main(String[] args) {
        Student s  = new Student("alec harmon", 16, "22765" );
    }

    private void validate_name(String name){
      // regex on name, only have acceptable chars
      String letters_and_spaces = "^[ A-z]+$";
      Pattern expression = Pattern.compile(letters_and_spaces);
      Matcher matcher = expression.matcher(name);
      if ( matcher.matches() ) {
        return;
      }
      else{
        throw new RuntimeException ( "Inputed Student Name has unacceptable characters" );
      }
    }

    private void validate_age(int age){
      // Im making an asumption that the the higest age of the students is 22
      if ( (age > 15) && (age < 22 )) {
        return;
      }
      throw new RuntimeException ( "Inputed Student Age is out of range" ) ;
    }

    private void validate_studentid(String studentid){
      if ( studentid.length() == 5 && studentid.substring(0,2).equals("22") ) {
        return;
      }
      throw new RuntimeException ( "Inputed StudentId is invalid" ) ;
    }

}
