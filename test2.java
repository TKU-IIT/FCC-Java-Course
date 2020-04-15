public class test2 {
    public static void main(String args[]) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
                j++;
            } while (j <= 9);
            System.out.println();
            i++;
        } while (i <= 9);
    }
}