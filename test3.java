import java.util.Arrays;
import java.lang.Object;
import java.util.Collection;


public class test3{
    public static void main(String[] args) {
        // a
        int A[] = { 53, 27, 69, 12, 3, 96 };
        // b
        for(int i = 0; i<A.length; i++) {
            System.out.println(A[i]);
        }
        // c
        int even=0, odd=0;
        for(int i = 0; i<A.length; i++) {
            if(A[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        //d, e
        int max_odd=A[0], max_even=A[0];
        for(int i = 0; i<A.length; i++) {
            
            if(A[i]%2==0){
                if(max_even<A[i])
                    max_even=A[i];
            }else{
                if(max_odd<A[i])
                    max_odd=A[i];
            }
        }
        System.out.println("Max Odd: "+max_odd);
        System.out.println("Max Even: "+max_even);
    }
}