
public class UniqueArray {

	public static void main(String[] args) {
		int[]arr={2,4,6,2,4,7,2,9,10};
		int n=arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					arr[j]=arr[n-1];
					n--;
					j--;
				}
			}
		}
		int narr[]=new int[n];
			for (int i = 0; i <n; i++) {
				narr[i]=arr[i];
				
			}
			for (int j = 0; j < narr.length; j++) {
			System.out.print(narr[j]+" ");
		
			
			
		}
		
	}
}


