import java.nio.channels.Selector;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://googlechromelabs.github.io/chrome-for-testing");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("dell");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("dell");
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		//driver.findElement(By.cssSelector("//input[@type='text'][2]")).sendKeys("john@gmail.com");
		System.out.println(driver.findElement(By.xpath("//form/h2")).getText());
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("32132431314");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-container']/button[1]")).click();
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // reg exp for password
		Thread.sleep(5000);
		//driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		// //input[@type='text'][2]
		
		// <a href="#" xpath="1">Forgot your password?</a>
		// <input type="text" placeholder="Name" xpath="1">
		// CSS selector
		// writing css Selector 
		// 1 way > using class name > tagname.classname > button.signInBtn
		// 2 way > using id > tagname#id> input#inputUsername 
		// 3 way > using tagname > Tagname[attribute='value'] > input['placeholder'='Username']
		
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		//<input type="password" placeholder="Password" name="inputPassword" value="">
		//<button class="submit signInBtn" type="submit">Sign In</button>
		
	}

}
