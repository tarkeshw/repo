package arrays;

public class Arraymissingnums {
public static void main(String[] args) {
	int a[]={2,10};
	int count=0;
	for(int i=1;i<a.length;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(a[i]+" ");
		}
	}
}
}
