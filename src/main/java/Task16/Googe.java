package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.navigate().to("https://www.google.com/");

String currenturl= driver.getCurrentUrl();

System.out.println("current URL:" +currenturl);

driver.navigate().refresh();

driver.close();
	}

}
