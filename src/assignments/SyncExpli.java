package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncExpli {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softs/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//WebDriverWait w = new WebDriverWait(driver, 3);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.xpath("//input[@value='user']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();
		
		WebElement userType = driver.findElement(By.xpath("//select[@class='form-control']"));

		Select s = new Select(userType);

		s.selectByVisibleText("Consultant");

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav-link.btn.btn-primary")));

		List<WebElement> products = driver.findElements(By.cssSelector(".btn.btn-info"));

		for (int i = 0; i < products.size(); i++) {

			driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();

		}

		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();

	}

}
