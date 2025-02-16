package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L02_LocatingByID {

	public static void main(String[] args) {
		//melakukan setproperty untuk memanggil webdriver
		System.setProperty("webdriver.chrome.driver", "E:\\development\\projectEclipse\\cobacobaSelenium\\chromedriver\\chromedriver.exe");
		
		//memanggil webdriver dari chromedriver
		WebDriver driver = new ChromeDriver();
		
		//melakukan open browser dan melakukan maximize window
		driver.manage().window().maximize();
		
		//melakukan navigate url ke halaman button
		driver.get("https://www.automationtesting.co.uk/button.html");
		
		//melakukan cek element dan klik pada button satu
		driver.findElement(By.id("btn_one")).click();
		
//		//menutup browser
//		driver.close();
	} 
}
