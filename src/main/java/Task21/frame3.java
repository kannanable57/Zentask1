package Task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://the-internet.herokuapp.com/nested_frames");
      
      driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      WebElement firstframe = driver.findElement(By.xpath("//a[text()='Nested Frames']"));
    		  
    	driver.switchTo().frame(firstframe);	 
      
    	 WebElement leftframe =  driver.findElement(By.xpath("//frame[@src='/frame_left']"));
    	 
    	 driver.switchTo().frame(leftframe);
    	 
	}

}
