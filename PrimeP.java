
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	public static boolean run(int number) {
		int p=0;
		boolean isSemiprime = false;
		ArrayList<Integer> array = new ArrayList<Integer>();
	for(int i=2;i<number;i++)
	{  p=0;
		for(int j=2;j<i;j++)
		{ 
			if(i%j==0)
				p=1;}
		if(p==0){
			array.add(i);
		}}
	for(int i=0; i<array.size(); i++) {
		for(int j=0; j<array.size(); j++) {
		if((array.get(i) * array.get(j)) == number )
		{
			isSemiprime = true;
		}
		}

		}
	return isSemiprime;

		}}
