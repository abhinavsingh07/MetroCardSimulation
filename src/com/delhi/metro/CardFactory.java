package com.delhi.metro;

import com.delhi.metro.charging.ChargingStrategy;

public class CardFactory 
{
	private static CardFactory instance;
	private ChargingStrategy chargSt;
	private CardFactory(ChargingStrategy _chargingStrategy)
	{
          chargSt=_chargingStrategy;

	}
	public static CardFactory getInstance(ChargingStrategy chst)
	{
		if(instance==null)
			instance=new CardFactory(chst);
		return instance;

	}
	
	
	public Card IssueACard(float initailAmount)
	{
		System.out.println("IssueACard chargSt"+chargSt);
		System.out.println("IssueACard chargSt"+this.chargSt);
		return new Card(initailAmount,this.chargSt);
		
		
	}

	
	
	
}
