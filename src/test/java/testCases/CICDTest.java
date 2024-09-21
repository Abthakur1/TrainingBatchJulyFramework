package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CICDTest {
    @Test
    public void test1(){
        System.out.println("cicd run with github actions");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.co.in/");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.co.in/");
        System.out.println(driver.getTitle());
    }
}
