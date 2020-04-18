public class MyDate{
	
	private int year;
	private int mouth;
	private int day;
	
	// constructors
	public MyDate(){
		year = 1970; mouth = 1; day = 1;
	}
	
	public MyDate(int year, int mouth, int day){
		this.year = year; this.mouth = mouth; this.day = day;
	}
	
	// toString and equals
	@override
	public string tostring(){
		return String.format("%04d-%02d-%02d", year, mouth, day);
	}
	@override
	public boolean equals(Object obj){
		if(obj instanceof MyDate){
			MyDate d = (MyDate)obj;
			return this.year==d.year
				&& this.mouth==d.mouth
				&& this.day==d.day;
		}
		return false;
	}
	
	// accessors
	// mutators
	public void setYear(int year){
		if(year != 0){
			this.year = year;
		}else{
			system.err.println("Invalid year value.");
		}
	}
	public void setMouth(int mouth){
		if(mouth>=1 && mouth<=12){
			this.mouth = mouth;
		}else{
			system.err.println("Invalid mouth value.");
		}
	}
	public void setDay(int day){
		if(Day>=1 && day<=31){
			this.day = day;
		}else{
			system.err.println("Invalid day value.");
		}
	}
	public int getYear(){
		return year;
	}
	public int getMouth(){
		return mouth;
	}
	public int getDay(){
		return day;
	}