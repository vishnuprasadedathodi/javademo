package Assignment_5;

import java.util.Scanner;

public class Average extends Sum{
	
	int avg;
	public Average(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}
	
	public void average()
	{
		avg=sum/10;
	}
	
	public void display()
	{
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);
	}
	
	public static void main(String[] args) {
		
		int  ar[]=new int[10];
		Scanner s =new Scanner(System.in);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter number=");
			ar[i]=s.nextInt();
		}
		
		Average a= new Average(ar);
		a.sumelement();
		a.average();
		a.display();
		}
	
}
