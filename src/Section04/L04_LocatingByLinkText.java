package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L04_LocatingByLinkText {

	public static void main(String[] args) {
		//melakukan setproperty untuk memanggil webdriver
		System.setProperty("webdriver.chrome.driver", "E:\\development\\projectEclipse\\cobacobaSelenium\\chromedriver\\chromedriver.exe");
		
		//memanggil webdriver dari chromedriver
		WebDriver driver = new ChromeDriver();
		
		//melakukan open browser dan melakukan maximize window
		driver.manage().window().maximize();
		
		//melakukan navigate url
		driver.get("https://www.automationtesting.co.uk");
		
		//melakukan cek element dropdown menu action lalu diklik
		driver.findElement(By.linkText("ACTIONS")).click();
		
//		//menutup browser
//		driver.close();
	} 
}
