package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

driver.get("https://jqueryui.com/datepicker/");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.switchTo().frame(0);

driver.findElement(By.xpath("//input[@id='datepicker']")).click();

driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

driver.findElement(By.xpath("//a[text()='22']")).click();

System.out.println("03/22/2024");


	}

}
