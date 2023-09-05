package Strings;

public class Split_function 
   {
	public static void main(String[] args)
	{
		
		String str="i love banglore";
		String[]obj=str.split(" ");   //("put space")
		for(int i=obj.length-1;i>=0;i--)
		{
			System.out.print(obj[i]+" ");  //("put space")
		}
		
	}
}
