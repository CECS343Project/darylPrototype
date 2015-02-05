package com.example.prototypedaryl.client;

import com.google.gwt.user.client.ui.*;

public class List 
{
	private VerticalPanel listMain = new VerticalPanel();
	private HorizontalPanel ListTop = new HorizontalPanel();
	private FlexTable patients = new FlexTable();
	private Button notify= new Button();
	private ListBox sort = new ListBox();
	MultiWordSuggestOracle suggest = new MultiWordSuggestOracle();
	SuggestBox searchBar = new SuggestBox(suggest);
	private Button delete = new Button();
	
	
	public VerticalPanel getPanel() 
	{
		listMain.add(notify);
		listMain.add(searchBar);
		listMain.add(sort);
		sort.addItem("A-Z");
		sort.addItem("Date");
		sort.addItem("Rx");
		sort.setVisibleItemCount(3);
		listMain.add(patients);
		
		 // Put some text at the table's extremes.  This forces the table to be
	    // 3 by 3.
	    patients.setText(0, 0, "upper-left corner");
	    patients.setText(2, 2, "bottom-right corner");

	    // Let's put a button in the middle...
	    patients.setWidget(1, 0, new Button("Wide Button"));

	    // ...and set it's column span so that it takes up the whole row.
	    patients.getFlexCellFormatter().setColSpan(1, 0, 3);
		return listMain ;
	}

}
