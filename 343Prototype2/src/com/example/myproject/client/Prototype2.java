package com.example.myproject.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class Prototype2 implements EntryPoint
{

	@Override
	public void onModuleLoad()
	{
		Login login = new Login();
		RootPanel.get("login").add(login.getPanel());
		// TODO Auto-generated method stub
		
	}
	
}