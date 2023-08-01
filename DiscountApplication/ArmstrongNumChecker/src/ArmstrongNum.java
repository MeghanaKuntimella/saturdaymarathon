
public class ArmstrongNum {
	public int armstrongChecker(int n,int count)
	{
		ArmstrongNum armstrongNum=new ArmstrongNum();
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int res=(int)Math.pow(rem,count);
			sum=sum+res;
			n=n/10;
		}
		return sum;
	}
}
