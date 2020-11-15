import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	// Assignment_II_XPath
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "webdriver\\chromedriver.exe");
		
		// 1- Navigate to http://www.google.com (not https)
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(100);

		// 2- Enter the key "coding book" to search field and press Enter
		WebElement q = driver.findElement(By.xpath("//input[@name = 'q']"));
		q.sendKeys("codingbook");
		Thread.sleep(100);
		q.submit();
		Thread.sleep(100);

		// 3- Select the first search result and goto CodingBook web site
		WebElement cbLink = driver.findElement(By.xpath("//*[@class='g'][1]//a"));
		cbLink.click();
		Thread.sleep(4000);

		// 4– In that page select "Courses" and then "test automation"
		WebElement testAutomationLink0 = driver.findElement(By.xpath("//li[@id='menu-item-6539']/a"));
		testAutomationLink0.click();
		Thread.sleep(100);
		WebElement testAutomationLink1 = driver.findElement(By.xpath("//li[@id='menu-item-6538']/a"));
		testAutomationLink1.click();
		Thread.sleep(100);

		// 5- Check that you are in the correct page
		// 6- In that page select "Curriculum" tab
		WebElement curriculumTab = driver.findElement(By.xpath("//*[@id='learn-press-course-tabs']/ul/li[2]/a"));
		curriculumTab.click();
		Thread.sleep(1000);

		// 7- Then select basic test automation assignment
		WebElement assignmentLink = driver
				.findElement(By.xpath("//span[contains(text(),'Basic Test Automation – Assignments')]"));
		assignmentLink.click();
		Thread.sleep(1000);

		// 8- Then click youtube link in that page
		WebElement youTubeLink = driver.findElement(By.xpath("//a[contains(text(), 'youtube')]"));
		youTubeLink.click();
	}
}
