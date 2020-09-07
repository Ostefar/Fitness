import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Person> employees = new ArrayList<Person>();
        ArrayList<Person> members = new ArrayList<Person>();


        Person a = new Members("Hans", "151291-7845", "full", members);
        Person b = new Members("Gertrud", "250199-2544", "basic", members);
        Person c = new Members("Thomas", "220589-8744", "basic", members);


        Person d = new Administration("Jonas", "141179-2481", employees);
        Person e = new Instructors("Janus", "261200-1871", 20,  employees);

        //Printer info om members
        Members.PrintAll(members);
        System.out.println("\n");

        //Printer info om de employees
        Administration.PrintAll(employees);
        System.out.println("\n");

        //Printer name og cpr på employees og members
        employees.addAll(members);
        Person.PrintAll(employees);
    }
}