package It.com.project.main;

import It.com.project.entity.Time;

public class Main {

	public static void main(String[] args) {
		Time time = new Time();
		Time time1 = new Time(21,5,8);

		System.out.println(time.printTime());
		System.out.println();
		System.out.println(time1.printTime());
		
		time1.addSeconds(65);
		System.out.println(time1.printTime());
		
	}

}
