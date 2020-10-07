package hwk3;

public class Tools {
    public static void printArr(String header, int[] a) {
        System.out.print(header);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }        
    public static void printArr(String header, double[] a) {
        System.out.print(header);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }    
    public static void print(Object... objs) {
        String sep = " ", end="\n" ;
        for (int i=0; i<objs.length; i++) {
            System.out.print(objs[i]) ; 
            if (i!=objs.length-1) System.out.print(sep) ;
        }
        System.out.print(end) ; 
    }    
}
