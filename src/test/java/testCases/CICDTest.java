package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CICDTest {
    @Test
    public void test1(){
        System.out.println("cicd run with github actions");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
    }
}
