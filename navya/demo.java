package hello.navya;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("this is my code");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	
	}

}
