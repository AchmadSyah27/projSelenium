package Section05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_Checkboxes {

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
		driver.findElement(By.xpath("//a[contains(text(),'DropDown Checkbox Radio')]")).click();
		
		//melakukan verifikasi sebuah checkbox apakah sudah tercentang atau belum
		System.out.println(
				driver.findElement(By.xpath("//label[@for='cb_green']")).isSelected());
		
		//melakukan click button submit
		driver.findElement(By.xpath("//label[@for='cb_green']")).click();
		
//		state sudahTerceklist = System.out.println(
//				driver.findElement(By.xpath("//label[@for='cb_green']")).isSelected());
		
		
	}

}
