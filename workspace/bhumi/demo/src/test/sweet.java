package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public abstract class sweet implements gift,Comparable
{
	
	static int n;
    static int l,h;
	static int p[]=new int[10];

	static int w[]=new int[10];
    static int totalweight=0;
	static ArrayList<chocolate> choco=new ArrayList<chocolate>();
	static ArrayList<candy> candies=new ArrayList<candy>();
	static ArrayList<gulabjamun> gulab=new ArrayList<gulabjamun>();
    private int price;
	protected int weight;
	public sweet(int weight,int price)
	{
		this.weight=weight;
		this.price=price;
	}
	
    public static void main(String args[])
    {
    	
    //	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	System.out.println("enter the no of object of sweet");
    	n=sc.nextInt();
    	for(int i=0;i<n;i++)
    	{ 
    		System.out.println("enter the weight");
		    w[i]=sc.nextInt();
		    System.out.println("enter the price");
	     	p[i]=sc.nextInt();
    		System.out.println("enter the type of sweets");
    		String str=(String) sc.next();
    		if(str=="chocolate")
    		{
    			
    			choco.add(new chocolate(w[i],p[i]));
    		}
    		else if(str=="candy")
    		{
    			
    			candies.add(new candy(w[i],p[i]));
    		}
    		else if(str=="gulabjamun")
    		{
    			
    			gulab.add(new gulabjamun(w[i],p[i]));
    		}
    		
    	}
        int c;
        System.out.println("Enter the option");
        c=sc.nextInt();
        do
        {
        	switch(c)
        	{
        	case 1:
        	{
        		  getTotalweight();
        		  break;
        	}
        	case 2:
        	{
        		 getchocolatesort();
        		 break;
        	}
        	case 3:
        	{
        		getcandies();
        		break;
        	}
             }
          }while(c<=3);

        }
     	
	

	
	
	protected static void getTotalweight() {
		for(int i=0;i<n;i++)
		{
			totalweight=totalweight+p[i];
		}
		//System.out.println(totalweight);
	}

	
	private static void getcandies() {
		System.out.println("enter the lower limit of candies");
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		System.out.println("enter the lower limit of candies");
		h=sc.nextInt();
		 ArrayList<candy> candies1=new ArrayList<candy>();
		 for (int i = 0; i < n; i++) {
            if(p[i]>l && p[i]<h)
            {
            	candies1.add(new candy(w[i], p[i]));
            }}
		 for(candy c:candies1)
		 {
			 System.out.println(c);
		 }
	}
	private static void getchocolatesort() {
		Collections.sort(choco);
		System.out.println("Sorting of chocolate");
		for(chocolate c:choco)
		{
			System.out.println(c);
		}
	}
	
	
    }

	
	
	
