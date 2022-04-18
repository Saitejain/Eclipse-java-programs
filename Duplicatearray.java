package programs;

public class Duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String []a = {"Sai","Teja","Teja","Testing","work","work"};
  String []temp = new String[a.length];
    int j = 0;
    for (int i = 0; i < a.length-1; i++) {
    	if(a[i] != a[i+1] ) {
    		
    		temp[j] = a[i];
    		j++;
    	}
    	
    }
	   temp[j] = a[a.length-1];
     for (int i = 0;i < temp.length; i++) {
    	 System.out.print(temp[i]+" ");
     }
	}
     
}
