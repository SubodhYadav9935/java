package lecture2_6;

public class JavaTeacher{
    private int salary = 500;
    private static JavaTeacher teacherinstance=null;
    private JavaTeacher(){
        System.out.println( "   constructer invoked");

    }
    public static JavaTeacher getTeacherinstance(){
        if(teacherinstance==null){
            teacherinstance=new JavaTeacher();
        }
        return teacherinstance;


    }

}
