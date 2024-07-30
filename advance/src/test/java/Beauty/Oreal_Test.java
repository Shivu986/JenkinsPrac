package Beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Oreal_Test {
	@Test
	public void a() {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.lorealparis.co.in/");
		driver.manage().window().maximize();
		System.out.println("Executng smoke");
		driver.close();
	}
}
