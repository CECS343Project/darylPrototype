package com.example.my.client;

import com.example.my.shared.*;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class _43Prototype implements EntryPoint
{

	@Override
	public void onModuleLoad()
	{
		Login login = new Login();
		//module is prototype
		RootPanel.get("login").add(login.getPanel());
		
		
	}
	
}
