package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.stepdefinition.WhatsAppPOM;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Whatsapp extends BaseClass {

	@Given("The user at the whatsapp webApplication")
	public void the_user_at_the_whatsapp_webApplication() {
		browserName("chrome");
		getUrl("https://web.whatsapp.com/");
		implicitlyWait(20);	
	}
	@When("user has to scan the QR code and application will be opened")
	public void user_has_to_scan_the_QR_code_and_application_will_be_opened() {
	}
	@When("Select one user {string} and send message as {string} only if the user name as {string}")
	public void select_one_user_and_send_message_as_only_if_the_user_name_as(String string, String string2, String string3) throws AWTException {
	  
//	@When("Select one user and send message as hi")
//	public void select_one_user_and_send_message_as_hi() throws AWTException {
//		WebElement element3 = driver.findElement(By.cssSelector("p[class^='selectable']"));
		WhatsAppPOM wp=new WhatsAppPOM();
		WebDriverWait wt= new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.visibilityOf(wp.getSearchUser()));
        click(wp.getSearchUser());
	    sendKeys(wp.getSearchUser(), string);
	    Actions a=new Actions(driver);
	    Robot r=new Robot();
	    List<WebElement> findElements = driver.findElements(By.cssSelector("div._21S-L>span[title^='Lava']"));
	    for(WebElement x:findElements) {
	    	String attribute = x.getAttribute("title");
	    	if(attribute.equals(string3)) {
	    		a.moveToElement(x).click().perform();
	    		driver.findElement(By.xpath("(//p[contains(@class,'selectable')])[2]")).
	    	    sendKeys(string2);
	    		r.keyPress(KeyEvent.VK_ENTER);
	    		r.keyRelease(KeyEvent.VK_ENTER);
	    	
	    	}
	    }
	}

	@Then("Close the application by logging out")
	public void close_the_application_by_logging_out() throws InterruptedException {
		Actions aa=new Actions(driver);
		driver.findElement(By.xpath("(//span[@data-testid='menu'])[1]")).click();
	    aa.moveToElement(driver.findElement(By.xpath("//div[text()='Log out']"))).click().perform();;
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//div[contains(@class,'_1M6AF')])[2]")).click();
	}
}
