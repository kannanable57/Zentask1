package Tas20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepic2 {

	public static void main(String[] args ) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		 driver.findElement(By.id("datepicker")).click(); 
		 
		 
		 
		 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']")).click();
		 
		                                                   
		 
		
		 
		
		                                            

	}

		
	}




	


