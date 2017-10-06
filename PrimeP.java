import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeP {
	public static void main(String[] args) {
		int n,p;
		Scanner s=new Scanner(System.in);
		System.out.println("Please insert the  number:");
		n=s.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=2;i<n;i++)
		{  p=0;
			for(int j=2;j<i;j++)
			{ 
				if(i%j==0)
					p=1;}
			if(p==0){
				array.add(i);
			}}
		System.out.println(array);
		for(int i=0; i<array.size(); i++) {
			for(int j=0; j<array.size(); j++) {
			if((array.get(i) * array.get(j)) == n )
			{
				System.out.println("Is semiprime");
			}
			
			}}}}