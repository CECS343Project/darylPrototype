package com.example.my.client;

import com.google.gwt.user.client.ui.*;

public class Login 
{
private VerticalPanel loginMain = new VerticalPanel();
private TextBox username = new TextBox();
private PasswordTextBox password = new PasswordTextBox();
private Button ok = new Button("ok");

public VerticalPanel getPanel()
{
	
	loginMain.add(username);
	loginMain.add(password);
	loginMain.add(loginMain);
	loginMain.add(ok);
	return loginMain;
	
}
}
