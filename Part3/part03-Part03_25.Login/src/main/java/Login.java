
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String s1=scanner.nextLine();
        System.out.println("Enter password: ");
        String s2=scanner.nextLine();
        if((s1.equals("alex") && s2.equals("sunshine")) || (s1.equals("emma") && s2.equals("haskell"))){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }
    }
}
