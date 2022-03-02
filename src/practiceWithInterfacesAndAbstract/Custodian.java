package practiceWithInterfacesAndAbstract;

public class Custodian extends Employee1{


    public Custodian(String name, String department) {
        super(name, department);
    }


    public String work() {
        return "Doing janitor things...";
    }
}
