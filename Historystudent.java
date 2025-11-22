package Day7;

public class Historystudent extends Student1{

    Historystudent(String Name,String Address,int historyMarks, int civisMarks){
        super(Name,Address);
        this.historyMarks=historyMarks;
        this.civisMarks=civisMarks;
        noOfStudent++;
    }
    int historyMarks;
    int civisMarks;

    public static int noOfStudent =0;



    @Override
    double getPercentage() {
        return (historyMarks + civisMarks)/2;

    }
}
