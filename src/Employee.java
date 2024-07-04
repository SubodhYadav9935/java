import java.sql.SQLOutput;

public class Employee {
   private int salary=20000;
   private String Address="london";
   public int getsalary(){

       return salary;
   }
   public static void getdepartment(){

       new Employee().getsalary();

       System.out.println("i am lazy.........");
   }


    public static void getsalary1(){

       getdepartment();
        System.out.println("hlo i receive my salary");


    }
    public String getAddress(){
       return Address;
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.getsalary();
        Employee.getsalary1();


    }
}
