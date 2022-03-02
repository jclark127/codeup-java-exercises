package practiceWithInterfacesAndAbstract;

public abstract class Employee1 {
    protected String name;
    protected String department;

    public Employee1(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public abstract String work ();
}
