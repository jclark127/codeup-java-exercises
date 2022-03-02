package practiceWithInterfacesAndAbstract;

public class Accountant extends Employee1{

    public Accountant(String name, String department) {
        super(name, department);
    }


    public String work() {
        return "Doing accountant things...";
    }
}
