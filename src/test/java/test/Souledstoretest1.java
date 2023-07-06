package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Souledstorepage1;

public class Souledstoretest1 {
	WebDriver driver;
    
    @BeforeTest
    public void setUp()
    {
  	  driver = new ChromeDriver();
  	  driver.get("https://www.thesouledstore.com");  
  	 
    }
    @Test
    public void thesouledstoretest()
    {
  	  Souledstorepage1 ob=new Souledstorepage1(driver);
  	 
  	  ob.menclick();
  	  ob.basicsclick();
  	  ob.setvalues("Naruto Pattern");
  	  ob.searchclick();
  	  ob.womenclick();
  	  ob.setvalues1("TSS Originals Stay Wild");
  	  ob.search1click();
  	  
    }
}
