package lecture2_8;

 class A11 {
    A11(){
        print();

    }
    void print(){
        System.out.println("A11");
    }

}
class B11 extends A11{
     int i=12;
    public static void main(String[] args) {
        A11 a=new B11();
        a.print();
    }
    void print(){
        System.out.println(i);
    }
}
