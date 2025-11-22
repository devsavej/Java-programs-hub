package Day6;

public class Hostler extends Student{

    double hostlefee;

    Hostler(int studid,String studname,double examfee,double hostlefee){
        super(studid,studname,examfee);
        this.hostlefee=hostlefee;
    }

    @Override
    public void Displaydetails(){
        super.Displaydetails();
        System.out.println("Hostle fee is :"+hostlefee);
        System.out.println("Total fee to pay:"+payfee());

    }

    @Override
    public double payfee(){
        return examfee+hostlefee;
    }


}
