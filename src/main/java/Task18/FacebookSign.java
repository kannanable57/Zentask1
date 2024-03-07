package Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookSign {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.navigate().to("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("9159592031");
driver.findElement(By.id("pass")).sendKeys("29081986");

driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
 



driver.findElement( By.id("u_4_b_r8")).sendKeys("Marikannan");

driver.findElement( By.id("u_4_d_bG")).sendKeys("kannan");

driver.findElement(By.xpath("//input[@id='u_4_g_dL']")).sendKeys("9159592031");

driver.findElement(By.xpath("//input[@id='///']"));


WebElement dateElement = driver.findElement(By.id("day"));

WebElement monthElement=driver.findElement(By.id("month"));

WebElement yearElement=driver.findElement(By.id("year"));

Select dateDropdown = new Select(dateElement);

Select monthDropdown = new Select(monthElement);

Select yearDropdown = new Select(yearElement);

dateDropdown.deselectByVisibleText("01");
		
monthDropdown.deselectByVisibleText("06");

yearDropdown.deselectByVisibleText("1986");

driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();

driver.findElement(By.name("websubmit")).click();

		



	}

}