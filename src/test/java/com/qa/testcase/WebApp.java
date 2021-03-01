package com.qa.testcase;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebApp {


	@Test
	public void WebappSearchboxTest() throws InterruptedException //Test Method
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghafu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	
	driver.get("http://3.14.10.211:8083/");

	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//Thread.sleep(3000);
	
	driver.findElement(By.id("About Us")).click();
      
    driver.findElement(By.id("PID-ab2-pg")).getText() ;
	
    String test = driver.findElement(By.id("PID-ab2-pg")).getText();
    
    assertEquals(test, 
   	"This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
    
    System.out.println("Test was successful");   
    
    driver.quit();
	
	
	}
	

}
