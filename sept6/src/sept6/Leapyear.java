package sept6;
import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter year");
		int y = s.nextInt();
		if((y % 400 == 0)&&(y % 4 == 0)||(y%100==0))
			System.out.println(y+" is leap year");
		else
			System.out.println(y+" is not a leap year");			
				
	}

}
