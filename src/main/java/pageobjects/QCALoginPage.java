package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QCALoginPage {
				
				WebDriver driver;
	
				By username = By.xpath("//input[@id='user_email']");
				By password = By.xpath("//input[@name='user[password]']");
				By loginBttn = By.name("commit");
	
				public QCALoginPage(WebDriver driver) {
					// TODO Auto-generated constructor stub
					
					this.driver=driver;
				}

				public WebElement username()
				{
					return driver.findElement(username);
				}
				
				public WebElement password()
				{
					return driver.findElement(password);
				}
			
				public WebElement loginBttn()
				{
					return driver.findElement(loginBttn);
				}
			

}
