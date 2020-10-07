package hwk3 ;
import java.util.*;

public class HWK_EX2 {

    public static void main(String[] args) {
        int[] x = new int[6], y = new int[6];
        double[] d = new double[6];

        Random r = new Random(111);
        for (int i = 0; i < x.length; i++) { // 填入[0,50]間的亂數
            x[i] = r.nextInt(51);
            y[i] = r.nextInt(51);
        }
        Tools.printArr("x=", x);    
        Tools.printArr("y=", y);
        calDistance(x, y, d);
        Tools.printArr("dist[]=", d);
    }
    public static void calDistance(int[] x, int[] y, double[] d) {
        // DIY here
    	for(int i=0; i<x.length; i++) {
    		d[i] = x[i] - y[i];
    		if(d[i]<0)
    			d[i]*=(-1);
    	}
    }
}
