package Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag {
	public static void main(String[] args) {
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='draggable]"));
        driver.findElement(By.xpath("//div[@id='droppable']"));


	}
}