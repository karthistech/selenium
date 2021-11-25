package seleniumdemo.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {
	
	public static void main(String args[])
	{
		int[] number = {3,1,4,2,5};
		int temp;
		
		
		Set<Integer> set1 = new TreeSet<Integer>();
		
		
		List list = new ArrayList(Arrays.asList(number));
		@SuppressWarnings("unchecked")
		Set<Integer> set = new TreeSet<Integer>((ArrayList)Arrays.asList(number));
	
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
		
		/*for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				if(number[i]>number[j])
				{
					temp = number[i];
					number[i]= number[j];
					number[j]=temp;
				}
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(number[i]);
		}
		
		*/
	}

}
