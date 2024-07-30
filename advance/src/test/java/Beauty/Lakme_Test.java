package Beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lakme_Test {
	
	@Test
	public void lak() {
//		 WebDriver driver= new ChromeDriver();
//		 driver.manage().window().maximize();
//		 driver.get("https://www.lakmeindia.com/");
		String a=System.getProperty("url");
		String b=System.getProperty("browser");
		String c=System.getProperty("username");
		
		System.out.println("Strat executing smoke1");
		 System.out.println("executing smoke");
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
	//	 driver.quit();
		 
	}

}
