package Day6;

public class Hostller1 extends Student1{
    String hostlename;
    int roomnumber;

    public String getHostlename() {
        return hostlename;
    }

    public void setHostlename(String hostlename) {
        this.hostlename = hostlename;
    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    @Override
    public String toString() {
        return Studid+" "+name+" "+departmentid+""+mobileno+" "+gender+" "+hostlename+" "+roomnumber;
    }
}
