package programs;
import java.util.*;
public class Testexcersises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner Sc = new Scanner (System.in);
		  System.out.println("please enter the first number");
		  int num1 = Sc.nextInt();
		  System.out.println("please enter the second number");
		  int num2 = Sc.nextInt();
		  int sum1 = num1 * num2;
		  int sum2 = num1 + num2;
		  int sum3 = num1 - num2;
		  int sum4 = num1 / num2;
		  int sum5 = num1 % num2;
		  System.out.println();
		  System.out.println("sum1: "+sum1);
		  System.out.println("sum2: "+sum2);	
		  System.out.println("sum3: "+sum3);
		  System.out.println("sum4: "+sum4);
		  System.out.println("sum5: "+sum5);
	}

}
