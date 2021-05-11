package Assignment_5;

import java.util.Scanner;

public class Days {
	
	private int days,y,m,d;
	
	public Days(int days)
	{
		this.days=days;
	}
	
	public void getyear()
	{
		y=days/365;
		
	}
	
	public void getmonth()
	{
		m=(days%365)/30;
	}
	
	public void getday()
	{
		d=(days%365)%30;
	}
	
	
	public void display()
	{
		System.out.println("year= "+y );
		System.out.println("month= "+m);
		System.out.println("days= "+d);
	}
	
	
	
	public static void main(String[] args) {
		int day;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter days=");
		day=s.nextInt();
		Days d=new Days(day);
		d.getyear();
		d.getmonth();
		d.getday();
		d.display();
		
	}
	
	

}
