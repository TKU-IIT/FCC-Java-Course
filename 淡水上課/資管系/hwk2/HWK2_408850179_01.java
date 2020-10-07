package hwk2;

public class HWK2_408850179_01 { // XX: 你的學號
    public static void main(String[] args) {
        System.out.println("===== printLine() ===== 4%") ;
        printLine('-', 50, "") ; 
        printLine('*', 30, ",") ; 
        
        System.out.println("===== printGCD() ===== 5%") ;
        printGCD(98,28,84) ; 
        
        System.out.println("===== printSymbol() ===== 7%") ;
        int[] counts = {3,2,6,4,3,5,1} ; 
        char[] symbol = {'+','-','@'};
        printSymbol(counts,symbol); 
    }
    public static void printLine(char t, int times, String sep) {
        // DIY
    	for(int i = 0; i < times; i++) {
    		System.out.print(t);
    		if(i!=times-1) 
    			System.out.print(sep);
    	}
        System.out.println();
    }    
    public static void printGCD(int a, int b, int c) {
        int g = 1 ; //自行修改
        // DIY
        int shortest = 0;
        if((a>b&&b>c)||(b>a&&a>c))
        	shortest = c;
        else if((b>c&&c>a)||(c>b&&b>a))
        	shortest = a;
        else if((a>c&&c>b)||(c>a&&a>b))
        	shortest = b;
        for(int i = 1 ; i < shortest; i++)
        	if(a%i==0&&b%i==0&c%i==0)
        		g = i;
        System.out.printf("gcd(%d,%d,%d)=%d\n",a,b,c,g) ; 
    }
    public static void printSymbol(int[] counts, char[] symbol) {
        // DIY
    	for(int i = 0, j = 0; i < counts.length; i++,j++) {
    		if(j>=3)j-=3;
    		for(int k = 0; k < counts[i];k++) {
    				System.out.print(symbol[j]);
    		}
    	}
    }
    
}