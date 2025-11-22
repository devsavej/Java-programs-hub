package Day6;

public class main {
    public static Hostller1 getHostellerDetails(){
        Hostller1 h=new Hostller1();
        System.out.println("Details Of Student");

        System.out.println("Student id:");
        h.setStudid(1);
        System.out.println(h.getStudid());

        System.out.println("Student name:");

        h.setName("Savej");
        System.out.println(h.getName());

        System.out.println("Department id:");
        h.setDepartmentid(111);
        System.out.println(h.getDepartmentid());

        System.out.println("mobile number:");
        h.setMobileno("98765432");
        System.out.println(h.getMobileno());

        System.out.println("gender:");
        h.setGender("male");
        System.out.println(h.getGender());

        System.out.println("Hostle name: ");
        h.setHostlename("Jbit");
        System.out.println(h.getHostlename());

        System.out.println("Roomnumber:");
        h.setRoomnumber(2);
        System.out.println(h.getRoomnumber());
        return h;




    }



    public static void main(String[] args) {
        getHostellerDetails();

    }

}
