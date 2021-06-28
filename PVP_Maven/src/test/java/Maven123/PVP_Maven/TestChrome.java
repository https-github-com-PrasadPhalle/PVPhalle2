package Maven123.PVP_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\001-Testing Class\\Videos\\Utkarshaa Testing Feb 2021\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();

		WebElement KiteLogo = driver.findElement(By.xpath("//*[@id=\"container\"]/header/a/img"));
		String KiteHeading = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[1]/h2")).getText();
		WebElement username = driver.findElement(By.xpath("//*[@id=\"userid\"]"));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement LoginBtn	= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button"));
				
		Boolean logo = KiteLogo.isDisplayed();
		System.out.println(logo);
		System.out.println(KiteHeading);
		username.sendKeys("XA0634");
		password.sendKeys("1234567");
		LoginBtn.click();
	}

}
