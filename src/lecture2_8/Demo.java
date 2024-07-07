package lecture2_8;

public class Demo {
    private static String name="subodh";
    private int x=10;


    public void show (){
        System.out.println("i am showing ");
        System.out.println(this.name);
        tell();


    }
    public Demo(){

    }
    public Demo(String name){
        this.name= name;
        System.out.println(name);

    }
    public void tell(){
        int x=12;
        System.out.println("i am telling ");
        System.out.println(x);
    }

    public static void main(String[] args) {
        Demo d = new Demo("mohan");
        d.show();

        System.out.println(Demo.name);
        System.out.println(name);
        Demo h = new Demo();
        System.out.println(name);
        System.out.println(Demo.name);
    }



}
