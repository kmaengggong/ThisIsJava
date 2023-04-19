package src;

public class MainClass{
    public static void main(String[] args){
        //StaticClass sc = new StaticClass();
        StaticClass sc = StaticClass.getInstance();

        sc.method(1, 2, 3, 4, 5, 6, 7);
    }
}