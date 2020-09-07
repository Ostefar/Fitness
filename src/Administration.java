import java.util.ArrayList;

public class Administration extends Person {
    protected int salary;
    protected int vacation;
    protected int hours;


    public Administration(String name, String cpr, ArrayList<Person> tpA) {
        super(name, cpr, tpA);
        this.salary = 33000;
        this.vacation = 5;
        this.hours = 37;
    }


    public static void Print(ArrayList<Person> tpA){
        System.out.println("\t \t \t \t *** EMPLOYEES ****");
        System.out.println("Name\t \tCPR\t \t \t \tHours\tSalary\t Vacation");
        System.out.println("******************************************************");

        for(int i = 0; i<= tpA.size()-1; i++){
            System.out.println(tpA.get(i));
        }
        System.out.println("\n******************************************************");
    }

    @Override
    public String toString() {
        return (name+"\t \t"+ cpr + "\t \t"+hours+"\t \t"+salary+",-"+"\t "+ vacation);
    }
}
