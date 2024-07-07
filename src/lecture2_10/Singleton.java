package lecture2_10;

public class Singleton {
    private int salary=500;
    private static Singleton teacherinstance=null;
    private Singleton(){
        System.out.println("this is singleton");

    }
    public static Singleton getTeacherinstance(){
        if(teacherinstance==null){
            teacherinstance=new Singleton();
        }
        return teacherinstance;
    }



}
