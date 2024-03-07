package Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.snapdeal.com/");
    
    
    driver.manage().window().maximize();
    
     WebElement sign = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
     
     Actions builder =new Actions(driver);
     
     
     builder.moveToElement(sign).perform();
     
     
     
    driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
     
     
     WebElement w = driver.findElement(By.id("login-register-modal"));
    
    driver.switchTo().frame(w);
     
    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("kannanable57@gmail.com");
     
    driver.findElement(By.xpath("//button[@id='checkUser']")).click();
    
    driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9159592031");
    
    driver.findElement(By.id("j_name")).sendKeys("Marikannan");
    
    driver.findElement(By.id("j_dob")).sendKeys("01061986");
    
    driver.findElement(By.id("j_password")).sendKeys("Mari@1986");
    
    driver.findElement(By.id("userSignup")).click();
    
    
    
	}

}
