import java.util.ArrayList;

public class Person {
    protected String name;
    protected String cpr;

    public Person(String name, String cpr, ArrayList<Person> tpA) {
        this.name = name;
        this.cpr = cpr;
        tpA.add(this);
    }

    public static void Print(ArrayList<Person> tpA){
        System.out.println("\t \t \t \t *** ALL ****");
        System.out.println("Name\t \t CPR");
        System.out.println("******************************************************");

        for(int i = 0; i<= tpA.size()-1; i++){
            System.out.println(tpA.get(i).name + "\t\t" + tpA.get(i).cpr);
        }
        System.out.println("\n******************************************************");
    }
}
