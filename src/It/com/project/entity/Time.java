package It.com.project.entity;

public class Time {
	protected int hour;
	protected int minute;
	protected int second;
	
	public Time() {
		hour = 1;
		minute = 30;
		second = 25;
	}
	
	public Time(int hour_, int minute, int second) {
		if (hour_ < 0 || hour_ > 24) {
			this.hour = 0;
		}else {
			this.hour = hour_;
		}		
		if (minute < 0 || minute > 59) {
			this.minute  = 0;
		}else {
			this.minute = minute;
		}
		if (second < 0 || second >59) {
			this.second = 0;
		}else {
			this.second = second;
		}
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public String printTime() {
		return String.format("%d:%d:%d",hour,minute,second);
	}
	
	public void addHours(int h) {
		addSeconds(h*60*60);
	}
	
	public void addMinutes(int m) {
		addSeconds(m*60);
	}
	
	public void addSeconds(int s) {
		second+=s;
		
		if (second>59) {
			minute+=second/60;
			second = second%60;
		}
		if (minute>59) {
			hour+=minute/60;
			minute = minute%60;
		}
		if (hour>24) {
			hour = hour%24;
		}
	}
}
