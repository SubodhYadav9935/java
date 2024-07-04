package lecture2_5;

import java.util.List;
import java.util.Arrays;

public class Debug {
    public static void main(String[] args) {

        List<Students> studentsList=Arrays.asList(
                new Students(23,"mohan") ,
                new Students(23,"amit") ,
                new Students(12,"mohit"));
        double sum=0;
        for(Students s:studentsList){
            sum=sum+s.getMarks();
        }

        double avg=sum/3;
        System.out.println("avg of three Student"+avg);

    }
}
class Students{
    private int marks;
    private String name;
    public int getMarks(){
        return marks;

    }
    public String getname() {
        return name;

    }
    public Students(int marks,String name){
        this.marks=marks;
        this.name=name;
    }
}
