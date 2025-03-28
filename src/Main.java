import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Sara sara = new Sara();
        Lilas lilas = new Lilas();
        Ahmad ahmad = new Ahmad();

        String name = input.nextLine();
        if(name.equals("Sara")){
            sara.sayHello("Hello from Sara");
        }

        else if (name.equals("Lilas")){
            lilas.sayHello("Hello from Lilas");
        }
        else if (name.equals("Sara food")){
            sara.food();
        }

        else if (name.equals("Ahmad food")){
            ahmad.food();
        }

        else if (name.equals("Lilas food")){
            lilas.food();
        }
        else{
            ahmad.sayHello("Hello from Ahmad");
        }

        
    }
}