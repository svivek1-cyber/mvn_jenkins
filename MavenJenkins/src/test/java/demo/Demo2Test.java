package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2Test {
	@Test
	public void hii() throws InterruptedException {
		System.out.println("hello");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/svivek1-cyber/ninza_crm_test/blob/master/ninza_crm/pom.xml");
		Thread.sleep(1);
		driver.quit();
		System.out.println("hello i m saurabh");
	}
}
