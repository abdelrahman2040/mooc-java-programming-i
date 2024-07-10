
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        PaymentCard Paulscard = new PaymentCard(20.0);
        PaymentCard Mattscard = new PaymentCard(30.0);
        Paulscard.eatHeartily();
        System.out.println("Paul: " + Paulscard);
        Mattscard.eatAffordably();
        System.out.println("Matt: " + Mattscard);
        Paulscard.addMoney(20.0);
        System.out.println("Paul: " + Paulscard);
        Mattscard.eatHeartily();
        System.out.println("Matt: " + Mattscard);
        Paulscard.eatAffordably();
        Paulscard.eatAffordably();
        System.out.println("Pauls: " + Paulscard);
        Mattscard.addMoney(50.0);
        System.out.println("Matt: " + Mattscard);
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

    }
}
