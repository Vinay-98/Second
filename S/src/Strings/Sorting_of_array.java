package Strings;

public class Sorting_of_array
{
	public static void main(String[]args)
	{
	int []obj= {12,3,1,5,4,15};
	for(int i=0;i<=obj.length-1;i++)
	{
		for(int j=i+1;j<=obj.length-1;j++)
		{
		if(obj[i]<obj[j])
		{
		int temp=obj[i];
		 obj[i]=obj[j];
		obj[j]=temp;
		}
		}
	}
	System.out.println("after sorting");
	for(int i=0;i<=obj.length-1;i++)
	{
		System.out.println(obj[i]);
	}	
	}
}
