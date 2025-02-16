import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDemo {

	public static void main(String[] args) {
		//melakukan setproperty untuk memanggil webdriver
		System.setProperty("webdriver.chrome.driver", "E:\\development\\projectEclipse\\cobacobaSelenium\\chromedriver\\chromedriver.exe");
		
		//memanggil webdriver dari chromedriver
		WebDriver driver = new ChromeDriver();
		
		//melakukan open browser dan melakukan maximize window
		driver.manage().window().maximize();
		
		//melakukan navigate url
		driver.get("https://www.automationtesting.co.uk");
		
		//menutup browser
		driver.close();
	} 
}
