package Day7;
public class student {
    private int Roll;
    private String name;
    private int marks;
    private char grade;

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    private char calculateGrade(){
        if (this.marks>=500){
            return 'A';
            
        } else if (this.marks<500 && this.marks>=400) {
            return 'B';
            
        } else {
            return 'C';
        }

    }

    public void details(String name,int roll,int marks){
       this.name=name;
       this.Roll=roll;
       this.marks=marks;
       this.grade=this.calculateGrade();
       System.out.println("Student { Name : "+this.name+" Roll no: "+this.Roll +" Marks: "+this.marks+" Grade: "+this.grade);

    }
    public student(){

    }


    public student(int Roll, String name, int marks) {
        this.Roll = Roll;
        this.name = name;
        this.marks = marks;

    }

    @Override
    public String toString() {
        return "student{" + "grade=" + grade + ", Roll=" + Roll + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }
}
