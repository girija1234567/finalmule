package com.main;

public class duplicates {
	public static void dup(String s1)
	{
		int count,i=0;
		char c1[]=s1.toCharArray();
		for(i=0;i<c1.length;i++)
		{
			count=0;
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]==c1[j])
				{
					count++;
					c1[j]='@';
					
				}
			}
			if(c1[i]!='@')
			{
				System.out.println("count of--"+c1[i]+"--is"+(count+1));
			}
		}
		
	}
}
