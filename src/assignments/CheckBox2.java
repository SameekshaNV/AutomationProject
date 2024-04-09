package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sameeksha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sameeksha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sameeksha");
		Thread.sleep(2000);
		driver.findElement(By.id("exampleCheck1")).click();
		Thread.sleep(2000);
		

	}

}
