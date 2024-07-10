
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aValue=scanner.nextInt();
        if(aValue < 0){
            System.out.println(aValue*-1);
        }else{
            System.out.println(aValue);
        }
    }
}
