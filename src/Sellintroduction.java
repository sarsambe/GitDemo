import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sellintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Browser starting 
		// ->Methods 
//		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://googlechromelabs.github.io/chrome-for-testing");
		System.out.println(driver.getTitle());
		//wait 3;
		System.out.println(driver.getCurrentUrl());

		driver.close();
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://rediff.com");
		System.out.println(driver1.getTitle());
		//wait 3;
		System.out.println(driver1.getCurrentUrl());

		WebDriver edge = new EdgeDriver();
		edge.get("https://www.gmail.com");
		System.out.println(edge.getTitle());
		//wait 3;
		System.out.println(edge.getCurrentUrl());
		
		
	}

}
