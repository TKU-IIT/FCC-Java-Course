import java.util.Scanner;
import java.text.DecimalFormat;

public class routine{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#.######");
		
		double num = input.nextDouble();
		double count = 0;
		double max = num;
		double min = num;
		double sum = 0;

        formatter.applyPattern("0.000000");
		
		do{
			if(num > max){
				max = num;
			}
			else if(num < min){
				min = num;
			}
		    count += 1;
		    sum = sum + num;
		    num = input.nextDouble();
		}while(num != 0);
   		System.out.println(formatter.format(min)+" "+formatter.format((sum / count))+" "+formatter.format(max));
	}
}