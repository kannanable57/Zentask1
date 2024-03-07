package Task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
      
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Area']")));
		
		driver.findElement(By.tagName("P")).clear();
		
		driver.findElement(By.tagName("P")).sendKeys("Hello People");
		
		driver.findElement(By.xpath("//div[@class='tox-statusbar__path']"));
		
		
	}

	
	
		
	}


