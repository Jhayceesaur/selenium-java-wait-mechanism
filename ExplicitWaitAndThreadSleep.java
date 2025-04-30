import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAndThreadSleep
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Waits for a specific condition (e.g., element to be visible or clickable).
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); //ExplicitWait for 5 seconds
		
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='reset-pwd-btn']")));
		element1.click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("sampleuserName01");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

	}

}
