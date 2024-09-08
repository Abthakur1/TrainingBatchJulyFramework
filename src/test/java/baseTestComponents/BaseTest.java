package baseTestComponents;

import org.abstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest extends AbstractComponents {
    public static WebDriver driver;

    public BaseTest(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public static void initialization() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://qa-practice.netlify.app/");
    }
}
