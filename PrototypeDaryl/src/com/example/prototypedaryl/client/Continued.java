package com.example.prototypedaryl.client;
import com.google.gwt.user.client.ui.*;

public class Continued 
{
	private VerticalPanel contMain = new VerticalPanel();
	private Label title = new Label("Continued");
	private TextBox allergies = new TextBox();
	private TextBox prior = new TextBox();
	private TextBox current= new TextBox();
	private Button submit = new Button("Submit");

	public VerticalPanel getPanel() 
	{
		contMain.addStyleName("account");
		contMain.add(title);
		title.addStyleName("contTitle");
		contMain.add(allergies);
		contMain.add(prior);
		contMain.add(current);
		contMain.add(submit);
		
		
		return contMain ;
	}

	
}
