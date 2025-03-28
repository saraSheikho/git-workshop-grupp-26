import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String name = input.nextLine();
        if(name.equals("Sara")){
            Sara sara = new Sara();
            sara.sayHello("Hello from Sara");
        }else if (name.equals("Lilas")){
            Lilas lilas = new Lilas();
            lilas.sayHello("Hello from Lilas");
        }else{
            Ahmad ahmad = new Ahmad();
            ahmad.sayHello("Hello from Ahmad");
        }
        
    }
}