package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-infobars");
		WebDriver d1=new ChromeDriver(Options);*/
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d1.manage().window().maximize();
		d1.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(3000);
		
		((JavascriptExecutor)d1).executeScript("scroll(0, 600)");

		Thread.sleep(5000);
		d1.findElement(By.xpath("//input[@name='firstname']")).sendKeys("rajesh");
		d1.findElement(By.xpath("//input[@name='lastname']")).sendKeys("r");
		d1.findElement(By.xpath("//input[@id='sex-0']")).click();
		d1.findElement(By.xpath("//input[@value='4']")).click();
		d1.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("14-Feb-2018");
		d1.findElement(By.xpath("//input[@value='Manual Tester']")).click();
		((JavascriptExecutor)d1).executeScript("scroll(0, 600)"); 
		d1.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\rrayachoti\\Desktop\\admin.png");
		d1.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		Select dropdown=new Select(d1.findElement(By.xpath("//select[@id='continents']")));
		dropdown.selectByIndex(2);
	}

}
