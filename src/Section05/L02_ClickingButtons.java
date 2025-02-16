package Section05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L02_ClickingButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//melakukan setproperty untuk memanggil webdriver
		System.setProperty("webdriver.chrome.driver", "E:\\development\\projectEclipse\\cobacobaSelenium\\chromedriver\\chromedriver.exe");
		
		//memanggil webdriver dari chromedriver
		WebDriver driver = new ChromeDriver();
		
		//melakukan open browser dan melakukan maximize window
		driver.manage().window().maximize();
		
		//melakukan navigate url ke halaman button
		driver.get("https://www.automationtesting.co.uk/buttons.html");
		
		//Melakukan click dengan element dari css
		driver.findElement(By.cssSelector("#btn_three")).click();
	}

}
