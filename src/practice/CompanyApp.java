package practice;

class CompanyApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Peter Gibbons", "IT");
        System.out.println(emp.getName() + " works in " + emp.getDepartment());
    }
}
