
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        System.out.println("Give a Word: " + text);
        System.out.println(text+text+text);
        // Write your program here
    }
}
