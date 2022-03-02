package practiceWithInterfacesAndAbstract;

public class Custodian extends Employee1{


    public Custodian(String name, String department) {
        super(name, department);
    }


    public String work() {
        return "Doing janitor things...";
    }

    @Override
    public String morningMeeting() {
        return "Morning meeting at 9AM";
    }

    @Override
    public String lunchTime() {
        return "Lunch time is at 12:30-1:00";
    }

    @Override
    public int dailyPay() {
        return 500;
    }
}
