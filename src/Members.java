import java.util.ArrayList;

public class Members extends Person {
    protected String membership;
    protected int fee;

    public Members(String name, String CPR, String membership, ArrayList<Person> tpA) {
        super(name, CPR, tpA);
        this.membership = membership;
        if(membership.equals("basic")){
            this.fee = 199;
        }else{
            this.fee = 299;
        }
    }
    public static void PrintAll(ArrayList<Person> tpA){
        System.out.println("\t \t \t \t *** MEMBERS ***");
        System.out.println("Name\t \tCPR\t \t \t \tMembership\t \tFee");
        System.out.println("******************************************************");

        for(int i = 0; i<= tpA.size()-1; i++){
            System.out.println(tpA.get(i));
        }
        System.out.println("\n******************************************************");
    }

    @Override
    public String toString() {
        return (name+"\t \t"+ cpr + "\t \t"+membership+"\t \t \t"+fee);
    }
}
