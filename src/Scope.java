import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Count number of links in page
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		driver.get("https://dev.mysql.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// Count nummber of links in footer of the page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Footerdriverlist = driver.findElement(By.id("gf-BIG"));
System.out.println(Footerdriverlist.findElements(By.tagName("a")).size());		
	}

}
