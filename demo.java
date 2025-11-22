package Day6;

import java.util.Scanner;

public class demo {

    public static Bank getbank(String bank){
        if(bank.equalsIgnoreCase("axis")){
            Axisbank axis=new Axisbank();
            axis.Branchname="Axis pahadigali Vikasnagar Branch";
            axis.ifsccode="axis01234";
            axis.Rateofintrest=7.5;
            return axis;

        } else if (bank.equalsIgnoreCase("icici")) {
            ICICIBank icici=new ICICIBank();
            icici.Branchname="ICICI Herbertpur Branch";
            icici.ifsccode="icici78654";
            icici.Rateofintrest=8;
            return icici;

        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Bank Name :");
        String bankname=sc.nextLine();

        Bank bank=getbank(bankname);

        if (bank!=null){
            bank.displayDetails();
        }
        if (bank instanceof Axisbank){
            ((Axisbank) bank).getCreditcard();
        }else {
         System.out.println("Invalid Bank Name");
         }

        sc.close();
    }


}
