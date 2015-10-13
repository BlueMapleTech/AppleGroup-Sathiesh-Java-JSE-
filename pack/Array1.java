package com.pack;
import java.util.*;
public class Array1 
	{
	public static void main(String args[])throws Exception
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string");
	String str=s.nextLine();
	int a=str.length();
	int e=a;
	for(int i=0;i<str.length();i++)
	{
	for(int k=a;k>0;k--)
	{
	System.out.print(" ");
	}
	int b=a;
	b=b-1;
	a=b;

	for(int j=0;j<=i;j++)
	{ 
	System.out.print(" "+str.charAt(j));
	}
	System.out.println("");
	}
	int c=e+e;
	int g=e;
	int h=e;
	int p=0;
	for (int l=g;l<c;l++)
	{
	p=p+1;
	for(int r=0;r<=p;r++)
	{
	System.out.print(" ");
	}
	g=g-1;
	for(int v=0;v<g;v++)
	{
	System.out.print(" "+str.charAt(v));
	}
	h=h-1;
	g=h;
	System.out.println("");
	}

	}
}
