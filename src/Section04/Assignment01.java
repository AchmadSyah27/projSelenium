package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Assignment01 {

	public static void main(String[] args) {
		//melakukan setproperty untuk memanggil webdriver
		System.setProperty("webdriver.chrome.driver", "E:\\development\\projectEclipse\\cobacobaSelenium\\chromedriver\\chromedriver.exe");
		
		//memanggil webdriver dari chromedriver
		WebDriver driver = new ChromeDriver();
		
		//melakukan open browser dan melakukan maximize window
		driver.manage().window().maximize();
		
		//melakukan navigate url
		driver.get("https://www.automationtesting.co.uk");
		
		//melakukan cek element button satu action lalu diklik
//		driver.findElement(By.cssSelector("#btn_one")).click();
		
		//menutup cookie pada web
		driver.findElement(By.xpath("//a[contains(@class,'close-cookie')]")).click();
		
		//melakukan scroll menuju menu loader
        WebElement iframe = driver.findElement(By.linkText("FILE UPLOAD"));
        new Actions(driver)
                .scrollToElement(iframe)
                .perform();
		
		//melakukan cek element button satu action lalu diklik menggunakan object xpath
		driver.findElement(By.linkText("LOADER")).click();
		
//		//menutup browser
//		driver.close();
	} 
}
