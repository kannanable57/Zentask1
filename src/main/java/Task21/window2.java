package Task21;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

driver.get("https://the-internet.herokuapp.com/windows");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

driver.findElement(By.xpath("//a[text()='Click Here']")).click();

String parentWindow = driver.getWindowHandle();

Set<String>windowHandles = driver.getWindowHandles();

List<String> Window = new ArrayList<>(windowHandles);

driver.switchTo().window(Window.get(1));

System.out.println("Child window: " +Window.get(1));

driver.close();

System.out.println("Parent window address: " +parentWindow);

driver.quit();

	}

}
