
import java.util.ArrayList;

public class Statistics {

    private int count ;
    private ArrayList<Number> numbers;

    public Statistics() {
        // initialize the variable numberCount here
        int count = 0;
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int value) {
        Number number = new Integer(value);
        this.numbers.add(number);
        // write code here
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        int sum = 0;
        for (Number number : this.numbers) {
            sum += number.intValue();
        }
        return sum;
    }

    public double average() {
         double average;
        if(count==0){
                     average = 0.0;
                     return average;
        }
        average = (double) this.sum() / (double) this.count;
        return (double) average;
    }

}
