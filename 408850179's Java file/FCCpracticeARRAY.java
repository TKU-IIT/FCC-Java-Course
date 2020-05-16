public class nope{
	public static void main(string[] arg){
		int array[5] = {100, 80, 60, 40, 20};
		int sum;
		int avg;
		int min;
		int max;
		for(int i = 0; i < array.length; i++){
			sum = sum + array[i];
			if(array[min]>array[i]){
				min = i;
			}else if(array[max]<array[i]){
				max = i;
			}
		}
		avg = sum/array.length;
		system.out.println(sum + "\n" + max + "\n" + min + "\n" + sum);
	}
}