package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Assignment 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./softs/chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://the-internet.herokuapp.com/nested_frames"); 
	driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_top']")));
	driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_middle']"))); 
	System.out.println(driver.findElement(By.id("content")).getText()); 
	}
}

