package mygitexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginSalesforce {

	@Test
	public void launchBrowser () throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PracticeWorkSpace\\mygitexample\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Program Started..!");
        driver.get("https://www.sharpitech.in/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
        System.out.println("Program Finished..!");
	}

}
