package com.Ola;

import java.util.Scanner;

public class OlaDriver {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	OlaApp OP=new OlaApp();
	for(;;)
	{
		System.out.println("1.Create Account 2.Login 3.Logout 4.Make A Ride 5. Cancel Ride 6. Make A Bill 7.Exit");
	switch(sc.nextInt())
	{
	case 1:OP.CreateAcc();
	break;
	
	case 2: OP.Login();
		break;
		
		
	case 3: OP.Logout();
		break;
		
		
	case 4: OP.MakeARide();;
		break;
		
		
	case 5: OP.CancelRide();
		break;
		
	case 6: OP.MakeABill();
		break;
		
	case 7:
		System.exit(0);
		break;
	
	
	}
		
		
	}
}
}
