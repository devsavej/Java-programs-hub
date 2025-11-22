package Day8;
interface X {
    public void funx();
    default void funx1(){
        System.out.println("funx1 of X");
    }
    public static void fux2(){
        System.out.println("funx2 of X");
    }

}