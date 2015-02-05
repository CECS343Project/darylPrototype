package com.example.prototypedaryl.client;

import com.google.gwt.user.client.ui.*;

public class Account
{
	private VerticalPanel accountMain = new VerticalPanel();
	private VerticalPanel vertPanel = new VerticalPanel();
	private VerticalPanel smallVertPanel = new VerticalPanel();
	private HorizontalPanel horiPanel = new HorizontalPanel();
	private TextBox name = new TextBox();
	private TextArea contact = new TextArea();
	private Button send = new Button("Send Prescription");
	private TextArea doctor = new TextArea();
	private TextArea pharmacy = new TextArea();
	private Hyperlink edit = new Hyperlink("Edit Patient", "Account.java");
	
	private TextArea profile = new TextArea();
	public VerticalPanel getPanel()
	{
		accountMain.addStyleName("account");
		accountMain.add(horiPanel);
		accountMain.add(vertPanel);
		horiPanel.add(profile);
		horiPanel.add(smallVertPanel);
		smallVertPanel.add(name);
		smallVertPanel.add(contact);
		smallVertPanel.add(send);
		vertPanel.add(doctor);
		vertPanel.add(pharmacy);
		vertPanel.add(edit);
		return accountMain;
		
	}
	
}
