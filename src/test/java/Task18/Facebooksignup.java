package Task18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooksignup {
	
	public static void main(String[] args) {
		
   
	
		  
	 ChromeDriver driver = new ChromeDriver
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().window().maximize();
	 // String urlFromwebpage =driver.getCurrentUrl();
	
	                                                               
	clickbutton("create new account");
	
	driver.findElement(By.xpath("////input[@id='u_l_b_Aj']")).sendKeys("Test");
	
	driver.findElement(By.xpath("//input[@id='u_l_d_s+']")).sendKeys("User");
	
	driver.findElement(By.xpath("//input[@id='u_l_g_CG']")).sendKeys("subbiah485@gmail.com");
	
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Sub@1986");
	
	WebElement dateElement = driver.findElement(By.id("day"));
	  WebElement monthElement = driver.findElement(By.id("month"));	  
	  WebElement yearElement = driver.findElement(By.id("year"));
	  
	  
	  
	  Select dateDropdown = new Select(dateElement);
	  Select monthDropdown = new Select(monthElement);
	  Select yearDropdown = new Select(yearElement);
	  
	  
	  dateDropdown.selectByVisibleText("11");
	  monthDropdown.selectByVisibleText("May");
	  yearDropdown.selectByVisibleText("1985");
	  
	  
	  driver.findElement(By.xpath("//input[@type='radio'and@value='2']"));
	  
	  driver.findElement( By.xpath("//button[@id='u_l_s_SQ']")).click();
	}

	private static void clickbutton(String string) {
		// TODO Auto-generated method stub=
		
	}


		// TODO Auto-generated method stub
		
	

		// TODO Auto-generated method stub
		
	}
