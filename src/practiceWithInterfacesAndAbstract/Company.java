package practiceWithInterfacesAndAbstract;

public class Company {
    public static void main (String[] args){
        Employee1 act = new Accountant("Jill","Accounting");
        Employee1 jan = new Custodian("Pedro", "Maintenance");
        System.out.println("act.work() = " + act.work());
        System.out.println("jan.work() = " + jan.work());

    }
}
