package com.pollhq.mymavenproject;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class FriedWindow extends HorizontalLayout {
	protected HorizontalLayout menuTitle;
	protected Label menuTitleLabel;
	protected CssLayout menuItems;
	protected Button pollButton;
	protected Button createButton;
	protected Button dataButton;
	protected Button friendsButton;
	protected Button giftButton;
	protected Button accountButton;
	protected Button logoutButton;
	protected HorizontalSplitPanel mainPanel;
	protected VerticalLayout createLayout;
	protected Label friendLabel;
	protected VerticalLayout inputLayout;
	protected TextField userField;
	protected Button followButton;
	protected VerticalLayout feedLayout;
	protected Label feedLabel;
	protected TabSheet feedTabs;

	public FriedWindow() {
		Design.read(this);
	}
}
