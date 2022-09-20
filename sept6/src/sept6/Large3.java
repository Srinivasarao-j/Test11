package sept6;
import java.util.Scanner;

public class Large3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1");
		int a = sc.nextInt();
		System.out.println("enter num2");
		int b = sc.nextInt();
		System.out.println("enter num3");
		int c = sc.nextInt();
		
		if((a>b)&&(a>c))
			System.out.println(a+" is larger");
		else if ((b>c)&&(b>a))
			System.out.println(b+" is larger");
		else
			System.out.println(c+" is larger");
				
	}

}
