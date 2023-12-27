package samplepgms;

public class PrintTheNumbersInDescendingOrder {

	public static void main(String[] args) {
		
int a[]= {90,10,50,5,15,40,30,60,20};
		
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		   System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < a.length; i++) {     
	            System.out.print(a[i] + " ");    
	        }    

	}

}
