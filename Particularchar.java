
public class Particularchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java string split method by javatpoint";
		char char1='t';  
		for(int i=0;i<s1.length();i++) {
           
			if(s1.charAt(i) == char1) {
		     System.out.println(i);
		     break;
			}
			
		}
	}

}
