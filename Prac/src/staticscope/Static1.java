package staticscope;

public class Static1 {

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
//        Static1 s = new Static1();
//        s.printing();
        printing();

    }

     static  void printing(){
        System.out.println("printing static");
    }
}
