package Day7;

public class Sciencestudent extends Student1{

    Sciencestudent(String Name,String Address,int physicsMarks,int chemistryMarks, int mathMarks){
        super(Name,Address);
        this.physicsMarks=physicsMarks;
        this.chemistryMarks=chemistryMarks;
        this.mathMarks=mathMarks;
        noOfStudents++;
    }




    public int physicsMarks;
    public int chemistryMarks;
    public int mathMarks;

    public static int noOfStudents=0;

    @Override
    double getPercentage() {

        return (physicsMarks + chemistryMarks + mathMarks)/3;

    }
}
