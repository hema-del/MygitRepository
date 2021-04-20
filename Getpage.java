import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getpage{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\karth\\node_modules\\geckodriver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

String l = driver.getPageSource();
System.out.println("Page Source:"+l);

	}
}

