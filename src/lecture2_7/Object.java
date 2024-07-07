package lecture2_7;

class Object {

}
class base1 extends Object{

}
class base2 extends Object{

}
class der1 extends base1{

}
class der2 extends base1{

}
class der4 extends base2{

}
class der3 extends base2{

}
class test{
    public static void main(String[] args) {
        base2 b=new der4();
        der4 d=(der4)b;

    }
}
