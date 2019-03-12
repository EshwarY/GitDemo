package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.QCAHomePage;
import pageobjects.QCALoginPage;

public class e2ea1 extends reqmethods {
	
			public static Logger log = LogManager.getLogger(e2ea1.class.getName());
			@BeforeTest
			public void beforetst() throws IOException
			{
				driver=initializeDriver();
			}	
	
			@Test(dataProvider = "reqdata")
			public void callingfromreqmethods(String username, String password, String text) throws IOException
			{
				
				
				driver.get(prop.getProperty("url"));
				
				QCAHomePage hp = new QCAHomePage(driver);
				hp.homeloginobj();
				
				QCALoginPage lp = new QCALoginPage(driver);
				lp.username().sendKeys(username);
				lp.password().sendKeys(password);
				lp.loginBttn().click();
				
				log.info("login Validation done");
				
				
				System.out.println(text);
				
				
			}
			@AfterTest
			public void closedown()
			{
				driver.close();
			}
			
	
			@DataProvider
			public Object[][] reqdata()
			{
				//row tests to run
				//column - no of values to be given for a single test
				Object[][] data =new Object[2][3];
				
				//0th row
				data[0][0] = "username1";
				data[0][1] = "pasword1";
				data[0][2] = "Restricted User";
				
				//1th row
				data[1][0] = "username2";
				data[1][1] = "password2";
				data[1][2] = "Non Restricted user";
				
				return data;
				
				
				
			}
			
		
}
