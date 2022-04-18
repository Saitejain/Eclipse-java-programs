package programs;
import java.util.*;
public class Switchstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner Sc = new Scanner(System.in);
   System.out.println("Enter your number");
   int num = Sc.nextInt();
   
   switch(num){
	   
   case 1 : System.out.println("RRR");
             break;
   case 2 : System.out.println("Pushpa");   
            break;
   case 3 : System.out.println("Bheemla");   
            break;
   case 4 : System.out.println("Acharya");       
            break;
   case 5 : System.out.println("HHMM");
            break;
   default : System.out.println("Movie no not entered");         
   }
   
   
   
   
	}

}
