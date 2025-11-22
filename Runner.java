package Day6;

public class Runner {

    public static void main(String[] args) {
        Dayscholar ds=new Dayscholar(102,"Rohan",2500,5000);


        Hostler hs=new Hostler(103,"Asif",2000,6000);
        System.out.println("-----/n Dayscholar Details");
        ds.Displaydetails();
        System.out.println("----/n Hostler Details");


        hs.Displaydetails();

    }
}
