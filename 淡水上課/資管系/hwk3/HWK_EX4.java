package hwk3;

public class HWK_EX4 {
    public static void main(String[] args) {
        int[][] data = {{18, 22, 39, 33}, {28, 35, 29}, {15, 26, 27, 93, 88}};
        int[] rowAvg = calRowAvg(data);
        System.out.println("avg of row1 =" + rowAvg[0]);
        System.out.println("avg of row2 =" + rowAvg[1]);
        System.out.println("avg of row3 =" + rowAvg[2]);
    }

    public static int[] calRowAvg(int[][] data) {
        // DIY here
    	int avg = 0, sum = 0, c = 0;
    	int[] averg = new int[data.length];
    	for(int[]a:data) {
    		sum = 0;
    		for(int i = 0; i < a.length ; i++)
    			sum += a[i];
    		avg = sum/a.length;
    		averg[c] = avg;
    		c++;
    	}
        return averg; // 自行修改本行
    }
}
