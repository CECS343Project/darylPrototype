package com.example.prototypedaryl.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.*;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PrototypeDaryl implements EntryPoint 
{
	@Override
	public void onModuleLoad()
	{
		// If the application starts with no history token, redirect to a new
	    // 'baz' state.
	  /*  String initToken = History.getToken();
	    if (initToken.length() == 0) {
	      History.newItem("baz");
	    }*/
		Login login = new Login();
		RootPanel.get("login").add(login.getPanel());
		Account account = new Account();
		RootPanel.get("account").add(account.getPanel());
		NewAccount newAccount = new NewAccount();
		RootPanel.get("newAccount").add(newAccount.getPanel());
		//Continued cont = new Continued();
		//RootPanel.get("cont").add(Continued.getPanel());
		//List list = new List();
		//RootPanel.get("list").add(List.getPanel());
		//Pharmacy pharm = new Pharmacy();
		//RootPanel.get("pharm").add(Pharmacy.getPanel());
		
	}
	public void onClick()
	{
		
	}
}
