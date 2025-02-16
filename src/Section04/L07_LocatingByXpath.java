package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L07_LocatingByXpath {

	public static void main(String[] args) {
		//melakukan setproperty untuk memanggil webdriver
		System.setProperty("webdriver.chrome.driver", "E:\\development\\projectEclipse\\cobacobaSelenium\\chromedriver\\chromedriver.exe");
		
		//memanggil webdriver dari chromedriver
		WebDriver driver = new ChromeDriver();
		
		//melakukan open browser dan melakukan maximize window
		driver.manage().window().maximize();
		
		//melakukan navigate url
		driver.get("https://www.automationtesting.co.uk/buttons.html");
		
		//melakukan cek element button satu action lalu diklik
//		driver.findElement(By.cssSelector("#btn_one")).click();
		
		//melakukan cek element button satu action lalu diklik menggunakan object xpath
		driver.findElement(By.xpath("//button[@id='btn_one']")).click();
		
//		//menutup browser
//		driver.close();
	} 
}
