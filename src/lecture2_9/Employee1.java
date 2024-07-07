package lecture2_9;

public class Employee1 {


    void SwipeCard(){
        System.out.println("Swiping the card");
    }
    void TeaBreak(){
        System.out.println("taking break");
    }
}

class Manager1 extends Emloyee{
    private car c;
    public car getCar(){
        return c;
    }
    public void setCar(car c){
        this.c=c;
    }
    void performancereview(){
        System.out.println("reviewing performance of the team");
    }
    public Manager1(car c){
        this.c=c;
    }
}
class car{
    String model;
    void Drive(){
        System.out.println("car facility for manager only");
    }
    public car(String model){
        this.model=model;
        System.out.println(model);
    }
}
class demo {
    public static void main(String[] args) {
        Manager1 m = new Manager1(new car("RangeRover"));
        m.setCar(new car("jbfj"));


    }
}
