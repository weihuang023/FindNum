
public class FindNum {

	static int[] findNumExcept(int[] arr, int num){
	for(int i=0; i<arr.length; i++){
		if (arr[i] == num)
			continue;
		else
			System.out.print(" "+arr[i]);
		}
	return arr;
	}
	
	static int findNum(int[] arr, int num){
		for(int i=0; i < arr.length; i++)
		{  
			if(arr[i] == num)
			return arr[i];
		}
       return -1;
	}
	
	public static void main(String arg[]){
		int [] intArray = new int[]{1,2,3,4,5};
		int num = 6;
		System.out.println("Found Number "+num+ " Location at "+findNum(intArray,num));	
		System.out.print("These are what I found");
		findNumExcept(intArray, num);
		
	}
}
