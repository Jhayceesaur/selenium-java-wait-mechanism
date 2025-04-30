import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait 
{

	public static void main(String[] args)
	{
		//Waits for a set time while trying to find elements globally (applies to all findElement calls).
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //ImplicitWait
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.tagName("button")).click();
		System.out.println(driver.findElement(By.xpath("//*[contains(text(), 'Hello World!')]")).getText());
		

	}

}
