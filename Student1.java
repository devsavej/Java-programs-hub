package Day7;

public abstract class Student1 {
    String Name;
    String Address;

    Student1(){

    }


    public Student1(String Name,String Address) {
        this.Name = Name;
        this.Address=Address;
    }

    public static int getTotalNoStudent(){
        return Sciencestudent.noOfStudents+Historystudent.noOfStudent;


    }


     abstract double getPercentage();



}
