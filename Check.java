import java.util.*;
class Check{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size,small,large;
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++){
			int x=sc.nextInt();
			arr[i]=x;
			 
			
		}
		Arrays.sort(arr);
			 small=arr[0];
			 large=arr[size-1];
		System.out.println("smaller element:"+small);
		System.out.println("larger element:"+large);
	}
}


			