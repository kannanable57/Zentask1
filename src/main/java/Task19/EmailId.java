package Task19;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailId {
	
	

		private static Object links;

		public static void main(String[] args) {
			
	        WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.guvi.in/sign-in/");
			
			driver.manage().window().maximize();
			
			 WebElement email = driver.findElement(By.id("email"));
			 
			 email.sendKeys("kannanable57@gmail.com");
			 
			 WebElement pass = driver.findElement(By.id("password"));
			 
			 pass.sendKeys("Mari@1986");
			  
			 //log in
			 
			WebElement location  = driver.findElement(By.className("login-btn"));
			
			location.click();
			
			java.util.List<WebElement>  links = driver.findElements(By.tagName("a"));
			
			System.out.println("Total anchor tags:" +links.size());
			
			
			//for(WebElement links1: links);
			
			
			
			//System.out.println(link.getText());
			
			
			WebElement login = driver.findElement(By.cssSelector("a[id='mobile-login']"));
			
			driver.findElement(By.xpath("//a[@id='login-btn']"));
			
			
			
		}
			
		}




