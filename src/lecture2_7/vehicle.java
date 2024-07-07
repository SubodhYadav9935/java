package lecture2_7;

import com.sun.security.jgss.GSSUtil;

interface vehicle {
    void Drive();

}
  class car implements vehicle{
    public void Drive(){
        System.out.println("car method called ");

    }

}
class bus implements vehicle{
    public void Drive(){
        System.out.println("bus method called");

    }
}
class Test{
    public static void main(String[] args) {
//        car c= new car();
//        c.Drive();
//        bus b=new bus();
//        b.Drive();
        Test t=new Test();
        vehicle v=new car();
//        v.Drive();

        t.move(v);
    }
    void move(vehicle v){
        v.Drive();

    }
}