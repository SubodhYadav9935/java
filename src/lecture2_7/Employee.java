package lecture2_7;

public class Employee {
  private int salary=500;
    private String name="amit";
    public int getSalary(){
        return salary;

    }

    public void setName(String name) {
        // if role is manager than only allow to access otherwise no 
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
class Colleage{
    public static void main(String[] args) {
        Employee em=new Employee();

        System.out.println(em.getSalary());
    }
}
class Manager{
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());


    }
}

