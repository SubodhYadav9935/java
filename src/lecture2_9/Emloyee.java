package lecture2_9;

public class Emloyee {
    // Is a relationship
    void SwipeCard(){
        System.out.println("swipping card");
    }
    void TeaBreak(){
        System.out.println("taking break");
    }

}
class Manager extends Emloyee{


    public static void main(String[] args) {
        Manager m=new Manager();
        m.SwipeCard();
        m.TeaBreak();
    }
}