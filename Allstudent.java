package Day7;

import java.util.Scanner;

public class Allstudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Science Student Name:");
        String sName=sc.nextLine();
        System.out.println("Enter The Address:");
        String sAdd=sc.nextLine();
        System.out.println("Enter The Physics/Chemistry/Math Marks:");
        int p=sc.nextInt();
        int c=sc.nextInt();
        int m=sc.nextInt();

      Student1 s1=new Sciencestudent(sName,sAdd,p,c,m);
      sc.nextLine();


      System.out.println("-------------------------------------------/");

      System.out.println("Enter History Student Name:");
      String hName=sc.nextLine();
      System.out.println("Enter History Student Address:");
      String hAdd=sc.nextLine();
      System.out.println("Enter The History/civic Marks:");
      int h=sc.nextInt();
      int ci=sc.nextInt();

      Student1 s2=new Historystudent(hName,hAdd,h,ci);
      sc.nextLine();

      System.out.println("Percentage of Student");
      System.out.println("Science Student Percentage Is:"+s1.getPercentage());
      System.out.println("History Students Percentage Is:"+s2.getPercentage());

      System.out.println("Total Number Of Students Is:"+Student1.getTotalNoStudent());




    }
}
