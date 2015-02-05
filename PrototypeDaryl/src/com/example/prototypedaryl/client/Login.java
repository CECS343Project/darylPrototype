package com.example.prototypedaryl.client;

import com.google.gwt.user.client.ui.*;

public class Login 
{
	private VerticalPanel loginMain = new VerticalPanel();
	
	private Hyperlink accountLink = new Hyperlink("Create Account", "Account.java");
	private Hyperlink passwordLink = new Hyperlink("Forgot Password?", "Password.java");
	private TextBox username = new TextBox();
	private PasswordTextBox password = new PasswordTextBox();
	private Button ok = new Button("LOGIN");

	public VerticalPanel getPanel()
	{
		loginMain.add(accountLink);
		accountLink.addStyleName("linkLogin");
		loginMain.add(username);
		loginMain.add(password);
		loginMain.add(ok);
		ok.addStyleName("okLogin");
		loginMain.addStyleName("login"); //ties this to the css
		loginMain.add(passwordLink);
		return loginMain;
	}
		
}
