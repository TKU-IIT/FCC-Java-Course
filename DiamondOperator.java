import java.util.ArrayList;
import java.util.List;

//abstract class definition declared here
abstract class num<T>{
	T a;
	public num(T a) {
		this.a = a;
	}
	abstract void run();
}

public class DiamondOperator {
	
	
	
	public static void main(String args[]) {
		
		num<Number> num1 = new num<>(2356+0.2) {
			@Override
			public void run() {
				System.out.println(a);
			}
		};
		num1.run();
  }
}

	
	
