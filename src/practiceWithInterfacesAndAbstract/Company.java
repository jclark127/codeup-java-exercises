package practiceWithInterfacesAndAbstract;

public class Company {
    public static void main (String[] args){
        Employee1 act = new Accountant("Jill","Accounting");
        Employee1 jan = new Custodian("Pedro", "Maintenance");
        System.out.println("act.work() = " + act.work());
        System.out.println("jan.work() = " + jan.work());
        System.out.println("act.morningMeeting() = " + act.morningMeeting());
        System.out.println("jan.morningMeeting() = " + jan.morningMeeting());
        System.out.println("act.lunchTime() = " + act.lunchTime());
        System.out.println("jan.lunchTime() = " + jan.lunchTime());
        System.out.println("act.dailyPay() = " + act.dailyPay());
        System.out.println("jan.dailyPay() = " + jan.dailyPay());
    }
}
