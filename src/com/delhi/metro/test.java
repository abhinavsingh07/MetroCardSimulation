package com.delhi.metro;
import java.text.*;
import java.util.*;

import com.delhi.metro.charging.WeekendWeekdayStrategy;
public class test 
{
	 static public void main(String args[])
	{
		
		SapientMetroSimulater sap=new SapientMetroSimulater();
		CardFactory cardFacrtory=CardFactory.getInstance(new WeekendWeekdayStrategy());
	    System.out.println("SIMULATER:::Creating a card with initail balance with 4.5 rupees");
		Card c4_5=cardFacrtory.IssueACard(4.5f);
		System.out.println("SIMULATER:::User1 trying to swipe card at station number 2");
		boolean isallowed=sap.swipeIn(c4_5, 2);
//		
//		
//		
//		
//		System.out.println("SIMULATER:::Created a card with initail balance with 100 rupees");
//		Card c100=cardFacrtory.IssueACard(100f);
//		System.out.println("SIMULATER:::User2 trying to swipe card at station number 2");
//		isallowed=sap.swipeIn(c100, 2);
//		System.out.println("SIMULATER:::User2 trying to exit card at station number 4");
//		isallowed=sap.swipeOut(c100, 4);
//		
//	
//		
//		System.out.println("SIMULATER:::User2 trying to swipe card at station number 4");
//		isallowed=sap.swipeIn(c100, 4);
//		System.out.println("SIMULATER:::User2 trying to exit card at station number 10");
//		isallowed=sap.swipeOut(c100, 10);
//	
//		sap.showSwapInOut("A4");
//		
//		
//		System.out.println("SIMULATER:::showing log");
//		sap.showLogs(c100.getCardNumber());
//		
//		
//         	    
//	     
//	
	
	}

}
