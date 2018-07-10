
public class Array 
{
	public static void main(String[] args)
	{
		int[] input = {1,2,3,4,5};
		int[] output = new int[5];
		int temp,arraylength=input.length;
		for(int i=0;i<arraylength;i++){
			temp=0;
			for(int j=0;j<arraylength;j++){ // 2 means leave 2 position add remaining
				if(j!=i){
					temp+=input[j];
				}
			}
			output[i]=temp;
		}
		for(int i=0;i<arraylength;i++){
			System.out.print(output[i]+" ");
		}
		
	}
	
}
