package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		
		String ActualResult=driver.getTitle();
		
		String ExpectedResult = "STORE";
		
		System.out.println(ActualResult);
		
		if(ActualResult.equals(ExpectedResult))
		{
		System.out.println("pass : Page landed on correct website");
		
	}else {
		System.out.println("Fail : Page not landed on correct website");
	}

}
}