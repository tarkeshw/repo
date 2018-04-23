package arrays;

public class Sorting {
public static void main(String[] args) {
	int a[]={2,3,4,5,6,7};
	int mid=a.length/2;
	int c=mid;
	for(int i=0;i<mid;i++)
	{
		int temp=a[i];
		a[i]=a[c];
		a[c]=temp;
		c++;
	}
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
