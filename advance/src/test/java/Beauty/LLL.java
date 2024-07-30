package Beauty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LLL {

	public static void main(String[] args) throws Throwable {
		
		//1)select by Index-->0
		//2)Select by value()
		//3)Select by visible Text()
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.=\"Create new account\"]")).click();
  
		Thread.sleep(2000);
		
		WebElement dateList = driver.findElement(By.id("day"));
        Select sel = new Select(dateList);
	//	sel.selectByIndex(14);
     // sel.selectByValue("30");
        sel.selectByVisibleText("18");
	
	    WebElement monthList = driver.findElement(By.id("month"));
	    Select sele = new Select(monthList);
	  //  sele.selectByIndex(0);
	 //   sele.selectByValue("10");
	      sele.selectByVisibleText("May");
	
	    WebElement yearList = driver.findElement(By.id("year")); 
	    Select select = new Select(yearList);
	  //  select.selectByIndex(0);
	  //  select.selectByValue("1998");
	      select.selectByVisibleText("2015");
	}

}