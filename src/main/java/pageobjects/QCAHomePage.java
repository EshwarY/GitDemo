package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QCAHomePage {
	
				WebDriver driver;
				
				By login =By.xpath("//span[contains(text(),'Login')]");
				By assertiontext = By.xpath("//h2[contains(text(),'Featured Courses')]");
				By contactlink = By.xpath("//a[contains(text(),'Contact')]");
				
				
				public QCAHomePage(WebDriver driver) {
					
					this.driver=driver;
				}
			
			
				public void homeloginobj()
				{
					driver.findElement(login).click();
				}  
				
				public WebElement assertiontest()
				{
					return driver.findElement(assertiontext);
				}
				
				public WebElement contactLinkTst()
				{
					return driver.findElement(contactlink);
				}
			
	

}
