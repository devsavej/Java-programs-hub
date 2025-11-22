package Day6;

 class Student {
    int studid;
    String studname;
    double examfee;

    public Student(int studid,String studname,double examfee){
        this.studid=studid;
        this.studname=studname;
        this.examfee=examfee;
    }

    public void Displaydetails(){

        System.out.println("Student Id Is: "+studid);
        System.out.println("Student name is:"+studname);
        System.out.println("Student examfee is:"+examfee);
    }

    public double payfee(){
        return examfee;
    }

}


