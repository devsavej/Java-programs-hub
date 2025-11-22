package Day8;

import java.util.Scanner;

public class Demo {

    public Hotel provideFood(int amount){
        Hotel hotel=null;
        if (amount>=1000){
            hotel =new Tajhotel();
        } else if (amount>200 && amount<1000) {
            hotel=new Roadsidehotel();
        }

        return hotel;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Amount");
        int amount=sc.nextInt();
        Demo d1=new Demo();

        Hotel hotel=d1.provideFood(amount);

        if (hotel!=null){
            hotel.chikenBiryani();
            hotel.masalaDosa();
        }else {
            System.out.println("Enter The Valid Amount..");
        }
        if (hotel instanceof Tajhotel){
            ((Tajhotel) hotel).welcomeDrink();
        }
    }

}
