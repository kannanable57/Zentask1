package Task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signupguvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  
  driver.manage().window().maximize();

  driver.get("https://www.guvi.in/register/");
  
 driver.findElement(By.id("name")).sendKeys("Marikannan");
 
 driver.findElement(By.id("email")).sendKeys("kannanable57@gmail.com");
 
 driver.findElement(By.id("password")).sendKeys("Mari@1986");
 
 
 driver.findElement(By.id("mobileNumber")).sendKeys("9159592031");
 
 driver.findElement(By.xpath("//a[@class='signup-btn']")).click() ;
 
 driver.findElement(By.xpath("//a[text()='Click here to Login']")).click();
 
 driver.findElement(By.xpath("//input[@class='form-control is-valid']")).sendKeys("kannanable57@gmail.com");
 
 driver.findElement(By.id("password")).sendKeys("Mari@1986");
 
 driver.findElement(By.id("mobile-login")).click();
 
	}

}
