package Day6;

public class Dayscholar extends Student{

    private double transportfee;

    Dayscholar(int studid,String studname,double examfee,double transportfee){
        super(studid,studname,examfee);
        this.transportfee= transportfee;
    }

    @Override
    public void Displaydetails(){
        super.Displaydetails();
        System.out.println("Transport fee is :"+transportfee);
        System.out.println("Total fee to pay:"+payfee());

    }

    @Override
    public double payfee(){
        return+examfee+transportfee;
    }
}


