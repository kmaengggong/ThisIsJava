package src;

public class StaticClass{
    // Field
    private static StaticClass sc = new StaticClass();

    // Construcotrs
    private StaticClass(){};

    // Methods
    public static StaticClass getInstance(){
        return sc;
    }

    public void method() {};
    public void method(int ... a) {
        System.out.println(a[0] + a[1] + a[2]);
    };
}