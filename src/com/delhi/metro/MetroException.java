package com.delhi.metro;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.swing.internal.plaf.metal.resources.metal;

public class MetroException extends Exception 
{
	private String message;
	
	public MetroException()
	{
		super();
		
	}
	public MetroException(String _message)
	{
		super(_message);
		this.message=_message;
	
		
	}
	public String toString()
	{
		
		return "DELHI-METRO Exception [ "+this.message+"] ";
		
	}

}
