import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double min = v;
        double max = v;
        double sum = 0.0;
        int c = 0;
        
        while (v!=0) {
            sum += v;
            c++;
            if (v>max) {
                max = v;
            }
            if (v<min) {
                min = v;
            }
            v = sc.nextDouble();
        }
        System.out.printf("%f %f %f", min, sum/c, max);
    }
}