package Day8;

import java.util.Scanner;

public class Employeeage {
    public static double calculateAverage(int[] age){
        for (int a:age){
            if(a<28  || a>40){
                System.out.println("invalid age encountered");
                return -1;
            }
        }
        int sum=0;
        for (int a:age){
            sum +=a;
        }
        return (double)sum/ age.length;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total no of employee" );
        int count=sc.nextInt();

        if (count<2){
            System.out.println("Please Enter The Valid Employees Count");
        return;
        }


        int [] age=new int[count];
        System.out.println("Enter the age for "+count+"Employee");
        for (int i=0;i<count;i++){
            age[i]=sc.nextInt();

        }
        double avg=calculateAverage(age);
        if (avg!=-1){
            System.out.println("Average Age Is:"+avg);
        }
    }

}
