import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	// Assignment_II_CSS
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "webdriver\\chromedriver.exe");
		
		// 1- Navigate to http://www.google.com (not https)
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
}