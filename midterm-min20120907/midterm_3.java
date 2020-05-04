import java.util.Scanner;

public class midterm_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Initialize the variable
        double val = 0;
        //Get input from Scanner until value is greater than 20
        do {
            val = scanner.nextDouble();
        } while (val <= 20);
        //square root value must be greater than 1
        int i = 0;
        while (val>=1.01) {
            val = Math.sqrt(val);
            i++;
        }
        
        System.out.println(i);
    }
}
