package com.g.g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class CompareDeparture implements Comparator<Airport>
{

	@Override
	public int compare(Airport o1, Airport o2) {
		// TODO Auto-generated method stub
		String s1=o1.getDeparture();
		String s2=o2.getDeparture();
		return s1.compareTo(s2);
	}
	
}

class CompareName implements Comparator<Airport>
{

	@Override
	public int compare(Airport o1, Airport o2) {
		String s1=o1.getName();
		String s2=o2.getName();
		return s1.compareTo(s2);
	}
	
}
class CompareDuration implements Comparator<Airport>
{

	@Override
	public int compare(Airport o1, Airport o2) {
		// TODO Auto-generated method stub
		Float f1=o1.getDuration();
		Float f2=o2.getDuration();
		return f1.compareTo(f2);
	}
	
}


class ComparePrice implements Comparator<Airport>
{

	@Override
	public int compare(Airport o1, Airport o2) {
		// TODO Auto-generated method stub
		Integer t1=o1.getPrice();
		Integer t2=o2.getPrice();
		return t1.compareTo(t2);
	}
	
}

public class Airport implements Comparable<Airport> {

	
	private String departure;
	private String name;
	private float duration;
	private int price;
	
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}

public Airport(String departure, String name, float duration, int price) {
		super();
		this.departure = departure;
		this.name = name;
		this.duration = duration;
		this.price = price;
	}

	public String getDeparture() {
	return departure;
}

public void setDeparture(String departure) {
	this.departure = departure;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getDuration() {
	return duration;
}

public void setDuration(float duration) {
	this.duration = duration;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String toString() {
	return "Airport [departure=" + departure + ", name=" + name + ", duration=" + duration + ", price=" + price + "]";
}

@Override
public int compareTo(Airport o) {
	// TODO Auto-generated method stub
	String s1=this.departure;
	String s2=o.departure;
	return s1.compareTo(s2);
}

}








class Alpha{

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Airport air1=new Airport("21.00","indigo",4.0f,3000);
	Airport air2=new Airport("22.00","vistara",9.0f,8000);
	Airport air3=new Airport("11.00","airline",3.0f,6700);
	
	 ArrayList <Airport> tr=new ArrayList<Airport>();
	tr.add(air1);
	tr.add(air2);
	tr.add(air3);
	
	//Collections.sort(tr);
	System.out.println("1.departure");
	System.out.println("2.name");
	System.out.println("3.duration");
	System.out.println("4.price");
	Scanner sc=new Scanner (System.in);
	int choice=sc.nextInt();
	if(choice==1)
	{
		Collections.sort(tr ,new   CompareDeparture());
	}
	else if(choice==2)
	{
		Collections.sort(tr ,new   CompareName());
	}
	
	else if(choice==3)
	{
		Collections.sort(tr ,new   CompareDuration());
	}
	else
	{
		Collections.sort(tr ,new   ComparePrice());
	}
	for(Airport a:tr)
	{
		System.out.println(a);
	}
	

	}

}
