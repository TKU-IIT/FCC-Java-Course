import java.util.Scanner;
public class MyTime{
        public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
                MyTime12 myet = new MyTime12(1,2,3);
                System.out.println(myet.getSecondOfDay());
        }
}

class MyTime12 implements MyTimeI{
	int h = 0, m = 0, s = 0, totalS = 0;
	String AP = "AM";
	MyTime12(int h, int m, int s){
		if(h<=12&&m>=0){
			this.h = h;
			this.AP = "AM";
		}
		else if(h>12){
			this.AP = "PM";
			this.h = h - 12;
		}else{
			throw new IllegalArgumentException();
		
		}
		if(m<60&&m>=0)
			this.m = m;
		else
			throw new IllegalArgumentException();
		if(s<60&&s>=0)
			this.s = s;
		else
			throw new IllegalArgumentException();
		this.totalS = this.s+(this.m*60)+(this.h*60*24);
	}
	@Override
	public int getSecondOfDay(){
		return totalS;
	}
	@Override
	public void add(int s){
		totalS += s;
	}
}

class MyTime24 implements MyTimeI{
	int h = 0, m = 0, s = 0, totalS = 0;

	MyTime24(int h, int m, int s){
		if(h<=24&&m>=0)
                        this.h = h;
		else
			throw new IllegalArgumentException();
                if(m<60&&m>=0)
                        this.m = m;
		else
			throw new IllegalArgumentException();
                if(s<60&&s>=0)
                        this.s = s;
		else
			throw new IllegalArgumentException();
	}
       @Override
       public int getSecondOfDay(){
	       return this.totalS;
       } 
       @Override
       public void add(int s){
       	       totalS += s;
       }
}

interface MyTimeI{
        int getSecondOfDay();
        void add(int s);
}


