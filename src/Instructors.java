
import java.util.ArrayList;

public class Instructors extends Person {
    protected int salary;
    protected int hours;

    public Instructors(String name, String cpr, int hours, ArrayList<Person> tpA) {
        super(name, cpr, tpA);
        this.hours = hours;
        this.salary = hours * 199;
    }

    @Override
    public String toString() {
        return (name+"\t \t"+ cpr + "\t \t"+hours+"\t \t "+salary+",-");
    }
}