package com.example.prototypedaryl.client;

import com.google.gwt.user.client.ui.*;

public class Pharmacy 
{

	private VerticalPanel pharmMain = new VerticalPanel();
	private FlexTable prescri = new FlexTable();
	public VerticalPanel getPanel() 
	{
		pharmMain.add(prescri);
		return pharmMain;
	}

}
