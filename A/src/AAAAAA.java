import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AAAAAA {

	public static void main(String[] args) {
		
		
		System.out.println("hi");
		
		System.setProperty("webdriver.gecko.driver", "/Users/jarrellsimon/Downloads/geckodriver");
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.findElement(By.id("email")).sendKeys("kawsar_faith@yahoo.com.au");
		dr.findElement(By.id("pass")).sendKeys("fhgygg");
		dr.findElement(By.id("u_0_2")).click();
		dr.quit();
		
		
 }

}
