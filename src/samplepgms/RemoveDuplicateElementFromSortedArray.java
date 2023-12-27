package samplepgms;

public class RemoveDuplicateElementFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1,4,5,3,6,7,8,5,4};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Duplicate Elements are : " + arr[i]);
				}
			}
		}
		

	}

}
