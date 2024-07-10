
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if (number ==0) {
                break;
            }else if(number<0){
                count++;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
