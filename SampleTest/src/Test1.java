import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hyma\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://hidden-chamber-33381.herokuapp.com/#/");
Thread.sleep(5000);
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//*[@id='app-view-container']/div[1]/div/div/div[1]/div/div[1]/a")).click();
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.id("password")).sendKeys("admin");
driver.findElement(By.xpath("//*[@id='login-page']/div/form/div[3]/button[2]")).click();
System.out.println(driver.getTitle());
		

	}

}
