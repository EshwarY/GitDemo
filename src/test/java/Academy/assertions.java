package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageobjects.QCAHomePage;


public class assertions extends reqmethods {
				
				public static Logger log = LogManager.getLogger(assertions.class.getName());
	
				@BeforeTest
				public void beforetst() throws IOException
				{
					driver=initializeDriver();
					driver.get(prop.getProperty("url"));
					log.debug("Entered URL");
					
				}			
				
				@Test
				public void assertiontst() throws IOException
				{
					
					
					QCAHomePage ahp = new QCAHomePage(driver);
					
					Assert.assertEquals(ahp.assertiontest().getText(), "FEATURED COURSES");
					System.out.println("text matched");
					log.info("Validation done for Text validation");
					Assert.assertTrue(ahp.contactLinkTst().isDisplayed());
					log.info("Validation done for Text validation-Contact link");
					
					System.out.println("Contact link displayed");
					//Assert.assertFalse(ahp.contactLinkTst().isDisplayed());
					
								
					
				}
				@AfterTest
				public void closedown()
				{
					driver.close();
				}
				

}
