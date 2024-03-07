package Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver =new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://jqueryui.com/droppable/");
    
    WebElement w = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
    
    driver.switchTo().frame(w);
    
WebElement source = driver.findElement(By.id("draggable"));

WebElement target = driver.findElement(By.id("droppable"));

Actions actions = new Actions(driver);

actions.dragAndDrop(source,target).build().perform();

String colourBeforeDnd =target.getCssValue("colour");

String colourAftereDnd =target.getCssValue("colour");

System.out.println("Colour before Drag and Drap:" + colourBeforeDnd);

System.out.println("Colour After Drag and Drap:" + colourAftereDnd);


	}

}
