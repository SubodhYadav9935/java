package lecture2_5;

import java.util.Scanner;

public class debugdemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sum=0;
        for(int i=0;i<3;i++){
            System.out.println("enter number");
            sum=sum+scan.nextDouble();
        }
        double avg=sum/3;
        System.out.println("average of three numbers"+avg);
    }
}
