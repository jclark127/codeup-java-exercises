package practiceWithInterfacesAndAbstract;

public class Accountant extends Employee1{

    public Accountant(String name, String department) {
        super(name, department);
    }


    public String work() {
        return "Doing accountant things...";
    }

    @Override
    public String morningMeeting() {
        return "Meeting at 10AM";
    }

    @Override
    public String lunchTime() {
        return "Lunch is at 12PM";
    }

    @Override
    public int dailyPay() {
        return 1000;
    }
}
