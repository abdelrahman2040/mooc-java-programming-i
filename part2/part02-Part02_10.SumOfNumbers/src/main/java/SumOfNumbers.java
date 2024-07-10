
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int number=scanner.nextInt();
            if(number==0){
                break;
            }else{
                sum+=number;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
