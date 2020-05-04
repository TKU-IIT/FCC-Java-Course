import java.util.Scanner;

public class midterm_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fname = scanner.next();
        String lname = scanner.next();
        System.out.println(lname.toUpperCase()+", "+fname);
    }
}
