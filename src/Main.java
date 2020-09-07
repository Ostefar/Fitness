import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Person> employees = new ArrayList<>();
        ArrayList<Person> members = new ArrayList<>();


        Person a = new Members("Hans", "151291-7845", "full", members);
        Person b = new Members("Gertrud", "250199-2544", "basic", members);
        Person c = new Members("Thomas", "220589-8744", "basic", members);


        Person d = new Administration("Jonas", "141179-2481", employees);
        Person e = new Instructors("Janus", "261200-1871", 20,  employees);

        //Prints info on members
        Members.Print(members);
        System.out.println("\n");

        //Prints info on employees
        Administration.Print(employees);
        System.out.println("\n");

        //Prints name & cpr on employees & members
        employees.addAll(members);
        Person.Print(employees);
    }
}