package Practicepgms;

public class CheckGivenNumberIsArmstrong {

	public static void main(String[] args) {
		
		int n=370;
		int temp,res,sum=0;
		temp=n;
		while(n>0)
		{
			res=n%10;
			sum=sum+(res*res*res);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Given Number is Armstrong : " + sum);
			
		}
		else
		{
			System.out.println("Given Number is not Armstrong : " + sum);
		}

	}

}
