package hello.navya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class comprehensive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.savaari.com/");
		//to automate oneway 
		//for signin
		//driver.findElement(By.cssSelector(".col-auto.user_login.pl-1.pl-md-2.pr-0.ng-star-inserted")).click();
		
		//for from city
		WebElement fromCity = driver.findElement(By.id("fromCityList"));
		fromCity.click();
		fromCity.sendKeys("Bangalore");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fromCity.sendKeys(Keys.ENTER);
			
		
		//for to city
		WebElement toCity = driver.findElement(By.xpath("//input[contains(@placeholder,'Start typing city - e.g. Mysore')]"));
		toCity.click();
		toCity.sendKeys("Mysore");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		toCity.sendKeys(Keys.ENTER);
		
		
		//for pickup date
		WebElement date = driver.findElement(By.xpath("//p-calendar[contains(@placeholder,'dd-mm-yyyy')]"));
		date.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//td[contains(@class,'p-datepicker-today')]")).click();

		
		//for pickup time
		WebElement time = driver.findElement(By.id("pickUpTime"));
		time.click();
		Select Tm= new Select(time);
	    Tm.selectByValue("2022-01-18T09:00:00+05:30");
	   
	}

};
