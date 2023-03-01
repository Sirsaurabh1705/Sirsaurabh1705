package com.Ola;

import java.util.Scanner;

public class OlaApp {
Account a;
Mini Mi=new Mini();
Prime Pr=new Prime();
Sweden Sw=new Sweden();
Ola O;
Price P;
static boolean b=false;
static boolean C=false;
Scanner sc=new Scanner(System.in);
public void CreateAcc()
{
	if(a==null)
	{
System.out.println("Please Enter Name");
String name=sc.next();
System.out.println("Please Enter Mobno");
long cno=sc.nextInt();
System.out.println("Please Enter Gender");
String Gender=sc.next();
System.out.println("Please Enter Address");
String Address=sc.next();
a=new Account(name,cno,Gender,Address);
System.out.println("Account is Created");
}
	else
	{
		System.out.println("Already Account Existed");	
	}
}

public void Login()
{
if(a!=null)
{
	System.err.println("Enter Mobile Number");
	int mob1=sc.nextInt();
	if(a.Mob==mob1)
	{
			b=true;
			System.out.println("Success!!!!");	
    }
	else
	{
		System.err.println("Enter Correct Mobile Number Credential!!!!");	
     }
}
else
{
	System.err.println("First Create a Account!!!");	
}
}

public void Logout()
{
if(b||a!=null)
{
a=null;	
System.err.println("Logout Sucesss!!");
}
else
{
System.err.println("First Login Your Account!!!");	
}
}

public void MakeARide()
{
if(a!=null)
{
	System.err.println("Enter Departure");	
	String From1=sc.next();
	System.err.println("Enter Arriwal");
	String To1=sc.next();
	System.err.println("Enter KM");
	int Km1=sc.nextInt();
	System.err.println("Please Select Car =1.Mini 2.Prime 3.Sweden");
	switch(sc.nextInt())
	{
	case 1: 
	{
		System.out.println("Mini Per Km Charges is : "+Mi.Price);
		P=new Price(Mi.Price);
		int Charges=Km1*P.price1;
		System.out.println("Total KM Charges is "+Charges);
		System.out.println("Please Pay :"+Charges);
		System.out.println("Enter Amount =");
		int money=sc.nextInt();
		if(money==Charges)
		{
		O=new Ola(From1,To1,Km1,Charges);
		C=true;
		System.out.println("Ride is Confirmed!!!!!");
		}
		else
		{
			System.out.println("Enter Correct Amount!!!!!");	
		}
	    }
		break;
	case 2:
	{
	
			System.out.println("Mini Per Km Charges is : "+Pr.Price);
			P=new Price(Pr.Price);
			int Charges=Km1*P.price1;
			System.out.println("Total KM Charges is "+Charges);
			System.out.println("Please Pay :"+Charges);
			System.out.println("Enter Amount =");
			int money1=sc.nextInt();
			if(money1==Charges)
			{
			O=new Ola(From1,To1,Km1,Charges);
			C=true;
			System.out.println("Ride is Confirmed!!!!!");
            }
			else
			{
				System.out.println("Enter Correct Amount!!!!!");	
			}
		}
		break;
	case 3: 
	{
		System.out.println("Mini Per Km Charges is : "+Sw.Price);
		P=new Price(Sw.Price);
		int Charges=Km1*P.price1;
		System.out.println("Total KM Charges is "+Charges);
		System.out.println("Please Pay :"+Charges);
		System.out.println("Enter Amount =");
		int money=sc.nextInt();
		if(money==Charges)
		{
		O=new Ola(From1,To1,Km1,Charges);
		System.out.println("Ride is Confirmed!!!!!");
		C=true;
	    }
		else
		{
			System.out.println("Enter Correct Amount!!!!!");	
		}
	}
	}
	

}
else
{
System.err.println("First Create Account");	
}
}

public void CancelRide()
{
if(O!=null&&a!=null)
{
O=null;	
System.err.println("Ride Is Canceled!!");
}
else
{
	System.err.println("Please Create Acc. or Book Ride");	
}
}
public void MakeABill()
{
if(O!=null&&a!=null)
{
	if(C)
	{
System.out.println("Name :"+ a.Name);
System.out.println("Mobile No :"+a.Mob);
System.out.println("Gender :"+a.Gender);
System.out.println("Address :"+a.Address);

System.out.println("Departure name :"+O.From);
System.out.println("Arrival name :"+O.To);
System.out.println("Total Km is :"+O.Km);
System.out.println("Price per Km is :"+P.price1);
System.out.println("Amount Paid :"+O.Charges);
System.out.println("Total Km is  :"+O.Km);
System.out.println("Thank-You For Booking!!!!!");
	}
	else
	{
		System.err.println("Kindly Make a Confirm Booking !!!");
	}
}
else
{
	System.err.println("Kindly Make a Confirm Booking!!!!");	
}




}
}