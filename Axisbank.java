package Day6;

public class Axisbank extends Bank{

    double Rateofintrest;

    @Override
    void displayDetails() {
        System.out.println("Branch Name Is :"+Branchname);
        System.out.println("Ifsc Code is :"+ifsccode);
        System.out.println("Axis Bank RateOfintrest is:"+Rateofintrest);
    }

    public void getCreditcard(){
        System.out.println("Get the Credit Card from the Axis bank");
    }
}
