package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Souledstorepage1 {

    WebDriver driver;

  By men=By.xpath("//*[@id=\"topbar\"]/div/div/div/ul/li[2]/a");
  By basics=By.xpath("//*[@id='navbarNavDropdown']/ul/div[4]/li/a");
  By type=By.id("search");
  By search=By.xpath("//*[@id=\"app\"]/div/div[1]/nav/div[1]/div/ul/li[1]/div/div/div/div/span[2]");
  By women=By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div/div/ul/li[1]/a");           
  By type1=By.id("search");
  By search1=By.xpath("//*[@id=\"app\"]/div/div[1]/nav/div[1]/div/ul/li[1]/div/div/div/div/span[2]");

               
      public Souledstorepage1(WebDriver driver)
{
           this.driver=driver;
 }
      public void menclick()
{
          driver.findElement(men).click();
}

      public void basicsclick()
{
            driver.findElement(basics).click();
            driver.navigate().back();
}
      public void setvalues(String searchproduct)
{
           driver.findElement(type).sendKeys(searchproduct);
}
      public void searchclick()
{
           driver.findElement(search).click();
           driver.navigate().back();

}
      public void womenclick()
{

         driver.findElement(women).click();
          driver.navigate().refresh();
}
      public void setvalues1(String searchproduct1)
{
 
           driver.findElement(type1).sendKeys(searchproduct1);
}
      public void search1click()
{
          driver.findElement(search1).click();
          driver.navigate().back();
          driver.quit();
}

}
