package programs;

public class Stringdemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str1 = new String("Hello world");
  String str2 = "Hi Everyone";
  String str3 = "how are you all";
  
  System.out.println(str1);
  System.out.println(str2);
  System.out.println(str3);
  System.out.println(str1.length());
  System.out.println(str2.length());
  System.out.println(str3.length());
  System.out.println(str1.charAt(4));
  System.out.println(str2.charAt(8));
  System.out.println(str3.charAt(1));
  System.out.println(str1.concat(str2));
  System.out.println(str2.concat(str3));
  System.out.println(str1.hashCode());
	}

}
