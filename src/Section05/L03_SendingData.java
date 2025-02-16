package Section05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_SendingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//melakukan setproperty untuk memanggil webdriver
		System.setProperty("webdriver.chrome.driver", "E:\\development\\projectEclipse\\cobacobaSelenium\\chromedriver\\chromedriver.exe");
		
		//memanggil webdriver dari chromedriver
		WebDriver driver = new ChromeDriver();
		
		//melakukan open browser dan melakukan maximize window
		driver.manage().window().maximize();
		
		//melakukan navigate url ke halaman button
		driver.get("https://www.automationtesting.co.uk");
		
		//Melakukan click dengan element dari css
		driver.findElement(By.xpath("//*[contains(text(),'Contact Us Form Test')]")).click();
		
		//melakukan input field first name
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Andrian");
		
		//melakukan input field last name
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Soedjadi");
		
		//melakukan input field email
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("andriantest@gmail.com");
		
		//melakukan input field email
		driver.findElement(By.xpath("//textarea[@placeholder='Comments']")).sendKeys("halo");
	
		//melakukan click button submit
		driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
	}

}
