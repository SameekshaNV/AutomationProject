package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softs/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='/windows']")).click();
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        Set <String> myWindows = driver.getWindowHandles();
        Iterator <String> thisWindow = myWindows.iterator();
        String parentWindow = thisWindow.next();
        String childWindow = thisWindow.next();
        driver.switchTo().window(childWindow);
        WebElement childText = driver.findElement(By.cssSelector(".example"));
        System.out.println(childText.getText());
        driver.switchTo().window(parentWindow);
        WebElement parentText = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
        System.out.println(parentText.getText());
        
    }
}
