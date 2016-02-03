
import java.util.Scanner;

public class BinarySearch {
	
	private static Scanner num;
	public static void main(String arg[]){
		
		int value, high, low, mid, total, search, data[];
		num = new Scanner(System.in);
		
		System.out.println("Enter number of elemets");
		
		total = num.nextInt();
		data = new int[total];
		
		System.out.println("Enter "+total+" Integers. ");
		
		for(value = 0; value < total; value++)
			data[value]=num.nextInt();
				
		System.out.println("Enter Value You wish to Find");
		search = num.nextInt();
		
		low = 0;
		high = data.length - 1;
		mid = (high + low)/2;
		
		while (low <= high){
			if (search > data[mid])
				low = mid + 1;
			else if (data[mid] == search) 
			{
				System.out.println(search + " found at location " +(mid + 1)+".");
				break;
			}
			else 
				high = mid -1;
				mid = (high + low)/2;
			}
		if (low > high)
			System.out.println(" no found ");
	}
}
