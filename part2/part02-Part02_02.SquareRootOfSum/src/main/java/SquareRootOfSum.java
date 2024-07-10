
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int root = scanner.nextInt();
        int sum=number+root;
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}
