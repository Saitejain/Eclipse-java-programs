package programs;
import java.io.*;
public class BufferedReader {

	public BufferedReader(InputStreamReader inputStreamReader) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
     BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));  
		
		System.out.println("Enter 1st number");
		int x = Integer.parseInt(br1.readLine());
		System.out.println("Enter 2nd number");
		int y = Integer.parseInt(br1.readLine());
		
		System.out.println("sum is :"+(x+y));
	}

	private String readLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
