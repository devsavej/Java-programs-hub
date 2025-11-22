package Day8;

public interface Y {
    void funy();

    default  void funy1(){
        System.out.println("funy1 of Y");

    }
    public static void funy2(){
        System.out.println("funy2 of Y");
    }
}