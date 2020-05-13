

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Nums {
	public static void main(String args[]) {
		try {
			Scanner input = null;
			input = new Scanner(new File("/home/min20120907/eclipse-workspace/Nums/src/Nums/list.txt"));
			ArrayList<Double> a = readData(input);
			
			if(a==null) System.exit(1);
			System.out.println("Here are the results: ");
			printData(a);
			System.out.println("The average is: " + getAvr(a));
			System.out.println("The summention is: " + getSum(a));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static ArrayList<Double> readData(Scanner s){
		ArrayList<Double> tmp = new ArrayList<Double>();
		while(s.hasNextDouble()) {
			tmp.add(s.nextDouble());
		}
		return tmp;
	}
	
	public static void printData(ArrayList<Double> tmp) {
		for(double i : tmp) {
			System.out.println(i);
		}
	}
	
	public static double getAvr(ArrayList<Double> tmp) {
		double sum = 0;
		for(double i : tmp) {
			sum+=i;
		}
		
		return sum/tmp.size();
	}
	
	public static double getSum(ArrayList<Double> tmp) {
		double sum = 0;
		
		for(double i : tmp) {
			sum+=i;
		}
		
		return sum;
	}
}
