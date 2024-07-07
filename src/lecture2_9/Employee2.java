package lecture2_9;

public class Employee2 {
    void SwipeCard(){
        System.out.println("swping the card :");
    }
    void teabreak(){
        System.out.println("taking a break");
    }

}
class Manger extends Employee2{
    private vehicle v;
    void performancereview(){
        System.out.println("performance good");
    }
    public Manger(vehicle vh){
        this.v=vh;
    }
    void getvehicle(){

    }
    void setV(vehicle s){
      this.v=s;
    }
}
interface vehicle{
    void Drive();
}
class car1 implements vehicle{
    String model;
    @Override
     public void Drive() {
        System.out.println("driving the car");

    }
    public car1(String model){
        this.model=model;

    }
}
class Aeroplane{
    public void Drive(){
        System.out.println("flying the aeroplane");
    }
}
class clientdemo{
    public static void main(String[] args) {
        Manger d=new Manger(new car1("BMW"));
        Manger c;
        c = new Manger((vehicle) new Aeroplane());
        //c.setV(new vehicle() )

    }
}
