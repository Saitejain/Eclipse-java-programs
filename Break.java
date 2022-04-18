package programs;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum = 0, capacity = 10;
         for(int i=1; i<=10; i++) {
          System.out.println(i);
          sum = sum + i;
          if(sum>=capacity)
          break;
         
         }
        System.out.println(sum);
	}

}
