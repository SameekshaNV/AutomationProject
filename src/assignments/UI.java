package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UI 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softs/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));				driver.get("https://rahulshettyacademy.com/angularpractice/");

		//send Name
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Sameeksha");

		//sendEmail
		driver.findElement(By.name("email")).sendKeys("sam@gmail.com");	

		//password
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("sam@123");	

		//check box
		driver.findElement(By.id("exampleCheck1")).click();	

		//Gender drop down
		WebElement genders = driver.findElement(By.id("exampleFormControlSelect1"));				
		Select gender = new Select(genders);
		gender.selectByVisibleText("Female");	

		//employment status	
		WebElement Student = driver.findElement(By.id("inlineRadio1"));	
		Student.click();	
		if(Student.isSelected())
		{			
		System.out.println("Student option is selected");
		Assert.assertTrue(true);
		}
		else	
		{	
		System.out.println("Student option is not selected");	
		Assert.assertTrue(false);
		}		

		//DOB	
		driver.findElement(By.name("bday")).sendKeys("01/02/1998");	

		//submit	
		driver.findElement(By.className("btn-success")).click();				
		Thread.sleep(2000);	

		//success message	
		String message = driver.findElement(By.className("alert-success")).getText();
		if(message.contains("successfully"))
		{		
		System.out.println("Submitted successfully..!");	
		Assert.assertTrue(true);
		}		
		else
		{	
		System.out.println("Incorrect message.");
		Assert.assertTrue(false);
		}	

		driver.close();
	}

}
