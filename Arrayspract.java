package programs;

public class Arrayspract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String arr[] = {"sai","Teja","testing","java","arrays","sai","Teja",};
         int arr2[][] = {{2,5,8},{3,6,9},{1,4,7}};
          int min = arr2[0][0];
         /*    for(String mov:arr) {
            	 System.out.println(mov);        	 
             }
            for(int[] test:arr2) {
            	for(int arra:test)
            	System.out.println(arra);
            }*/
        //to get minimum number in the matrix use below code
          for(int i=0;i<3;i++) {
        	 for(int j=0;j<3;j++) {
        		 if(arr2[i][j]<min) {
        			 min=arr2[i][j];
        		 }
        	 }
         }
         System.out.println(min);
// to get maximum number in the matrix use below code
         //int max = arr2[0][0]; (need to change above in the place of int min = arr2[0][0];)
         /*for(int i=0;i<3;i++) {
        	 for(int j=0;j<3;j++) {
        		 if(arr2[i][j]>max) {
        			 max=arr2[i][j];
        		 }
        	 }
         }
         System.out.println(max);
*/
	
	
	}
	
}
