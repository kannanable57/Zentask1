package Task18;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleclass {
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.guvi.in/");
	driver.manage().window().maximize();
	
driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary text-white px-4']")).click();

driver.findElement(By.id("name")).sendKeys("Marikannan Kannan");

driver.findElement(By.id("email")).sendKeys("kannanable57@gmail.com");

driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mari@1986");

driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9159592031");

driver.findElement(By.xpath("//a[@id='signup-btn']")).click();








}
}