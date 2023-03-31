package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class WhatsAppPOM extends BaseClass {

	public WhatsAppPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='_2dfCc']")
	private WebElement loader;
    
	public WebElement getLoader() {
		return loader;
	}

	@FindBy(xpath="//p[contains(@class,'selectable')]")
	private WebElement searchUser;
	
	public WebElement getSearchUser() {
		return searchUser;
	}

	@FindBy(xpath="//h1[text()='WhatsApp Web']")
	private WebElement insideContent;

	public WebElement getInsideContent() {
		return insideContent;
	}
}
