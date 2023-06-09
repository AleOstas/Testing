import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroducereSelenium {
	
	public static void main(String[] args) {
		//invoke chrome
		//chromedriver.exe -> Chrome Browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/aleostas/Downloads/chromedriver_mac64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://myelectrica.ro/index.php?pagina=login");
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.name("myelectrica_utilizator")).sendKeys("hello@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"myelectrica_pass\"]")).sendKeys("Blah123");
		driver.findElement(By.id("myelectrica_login_btn")).click();
		
		driver.close();
		
	}

}
