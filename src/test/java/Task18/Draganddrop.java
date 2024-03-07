package Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		
		WebElement From = driver.findElement(By.id("draggable"));
		
		WebElement To = driver.findElement(By.id("draggable"));
		
		
		 WebElement ele = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable ui-state-highlight']"));
		 
		 String bgcolour = ele.getCssValue("background");
		 
		 System.out.println("---bgcolour-----"   +bgcolour);
		 
		 
		 
		 WebElement textt =  driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		 
		 System.out.println("Drag me to my target");
		 
		
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
		
		
		

}
	
}
		



