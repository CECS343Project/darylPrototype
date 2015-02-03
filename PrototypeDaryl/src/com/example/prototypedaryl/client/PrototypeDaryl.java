package com.example.prototypedaryl.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PrototypeDaryl implements EntryPoint 
{
	@Override
	public void onModuleLoad()
	{
		Login login = new Login();
		RootPanel.get("login").add(login.getPanel());
		// TODO Auto-generated method stub
		
	}
	
}
