package com.example.prototypedaryl.client;

import com.google.gwt.user.client.ui.*;

public class NewAccount 
{

	private VerticalPanel newAccountMain = new VerticalPanel();
	private HorizontalPanel addressPanel = new HorizontalPanel();
	private Label title = new Label("New Account");
	private TextBox firstName = new TextBox();
	private TextBox lastName = new TextBox();
	private TextBox address = new TextBox();
	private ListBox stateList = new ListBox();
	private TextBox zip= new TextBox();
	private TextBox email = new TextBox();
	private Button next = new Button("NEXT");
	
	public VerticalPanel getPanel()
	{
		newAccountMain.addStyleName("newAccount");
		newAccountMain.add(title);
		title.addStyleName("accountTitle");
		newAccountMain.add(firstName);
		newAccountMain.add(lastName);
		newAccountMain.add(addressPanel);
		addressPanel.add(address);
		addressPanel.add(stateList);
		addressPanel.add(zip);
		stateList.addItem("AZ");
		stateList.addItem("CA");
		stateList.addItem("NV");
		stateList.addItem("OR");
		stateList.addItem("UT");
		stateList.setVisibleItemCount(5);
		newAccountMain.add(email);
		newAccountMain.add(next);
		return newAccountMain;
		
	}
}
