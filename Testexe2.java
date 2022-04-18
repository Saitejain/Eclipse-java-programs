package programs;
import java.util.*;
public class Testexe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner Sc = new Scanner(System.in);
       System.out.println("provide your first number x");
       int x = Sc.nextInt();
       System.out.println("provide your second number y");
       int y = Sc.nextInt();
       
       if(x>y){
    	   System.out.println("x is greater than y");
       }
       else{
    	   System.out.println("x is lesser than y");
       }
       
	}

}
