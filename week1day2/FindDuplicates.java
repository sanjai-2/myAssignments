package week1day2;

public class FindDuplicates {
      public static void main(String[] args) {
    	  
		int[] num = {2,5,7,7,5,9,2};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++)   {
			if(num[i]==num[j])  {
				System.out.println(num[i]);
				break;
			}
		
			}
		}
	}
}
