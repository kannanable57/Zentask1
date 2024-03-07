package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence");
		
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
         
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/header/nav/div/div/div/div/ul/li[6]/a/div']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"toc-History\"]/a/div']")).click();
		
		
		driver.findElement(By.xpath("//body[@class='skin-vector skin-vector-search-vue mediawiki ltr sitedir-ltr mw-hide-empty-elt ns-0 ns-subject page-Artificial_intelligence rootpage-Artificial_intelligence skin-vector-2022 action-view uls-dialog-sticky-hide']")).click();
	}
	
}
