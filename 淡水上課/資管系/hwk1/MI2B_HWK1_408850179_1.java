package HWK1;
import static java.lang.System.out;
public class MI2B_HWK1_408850179_1{ 
    public static void main(String[] args) {
        System.out.println("=== pow(t,y) 4% === ") ;                
        double t=2.8; int y=5 ;
        double ans = intPower(t,y) ; 
        System.out.println("power("+t+","+y+")="+ans) ;
        
        
        System.out.println("=== isPrime(n) 4% === ") ;                        
        int n1 = 223, n2 = 177 ; 
        if (isPrime(n1)) System.out.println(n1+" is a prime.");
        else System.out.println(n1+" is not a prime.");
        if (isPrime(n2)) System.out.println(n2+" is a prime.");
        else System.out.println(n2+" is not a prime."); 
        
        
        System.out.println("=== gcd(a,b) 5% === ") ;
        int a=58058, b=86086 ; 
        int g = gcd(a,b) ;
        System.out.println("gcd("+a+","+b+")="+g) ;
        

        System.out.println("=== numOfdigit(num) 5% === ") ;
        int n3= 8050, n4= 185736, n5 = -443321567 ;
        int d1 = numOfDigits(n3), d2 = numOfDigits(n4), d3=numOfDigits(n5) ;
        System.out.println(n3+":"+d1+", "+n4+":"+d2+", "+n5+":"+d3) ;
    }
    // DIY here, intPower(), isPrime(), gcd(), numOfDigit(), f()
    public static double intPower(double num, int pow){
        double numP1 = num;
        for(int i =0; i<pow; i++){
            numP1 *= num;
        }
        return numP1;
    }
    public static boolean isPrime(int num){
        for(int i = 2; i <=num; i++){
            if(num%i==0)return false;
        }
        return true;
    }
    public static int gcd(int num1, int num2){
        int tmp;
        while (num1 % num2 != 0) {
            tmp = num2;
            num2 = num1 % num2;
            num1 = tmp;
        }
        return num2;
    }
    /*  if(0 != num2){
            while((num1 %= num2)!=0&&(num2 %= num1)!=0){
                return num1+num2;
            }
        }
        return 1;
    }*/
    public static int numOfDigits(int num){
    	if(num<0) {
    		num*=-1;
    	}
        int digits = 1;
        for(;num/10>0;num/=10,digits++);
        return digits;
    }
}

