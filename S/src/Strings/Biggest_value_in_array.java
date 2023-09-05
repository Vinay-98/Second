package Strings;

public class Biggest_value_in_array 
{
	public static void main(String[] args) 
	{
	int[]obj= {10,4000,50,30};
	int big=0;
	for(int i=0;i<=obj.length-1;i++)
	{
		if(big<obj[i])
		{
			big=obj[i];
		}
	}
		System.out.println(big);
	}
	}


