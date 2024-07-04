package lecture2_4;

 class objectdemo {
    private static  int count=0;
     {
         count++;
     }
    objectdemo(){
        this(12);
        //count++;

    }
    objectdemo(int i){
        //count++;
        System.out.println("int args coonstructor ...");

    }


    public static void main(String[] args) {
        objectdemo obj1=new objectdemo();
        objectdemo obj2=new objectdemo(1);
        objectdemo obj3=new objectdemo(2);
        objectdemo obj4=new objectdemo(3);
        System.out.println("value of object count is "+count);
        System.out.println("thanks");
    }
}
