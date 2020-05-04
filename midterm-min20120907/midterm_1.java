import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        switch(a.substring(a.length() - 1)){
            case "".':
                System.out.println("declarative");
                break;
            case '?':
                System.out.println("interrogative");
                break;
            case '!':
                System.out.println("exclamatory");
                break;
        }
    }
}
