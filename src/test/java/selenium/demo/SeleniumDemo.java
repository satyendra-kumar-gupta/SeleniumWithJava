package selenium.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/index.php");

        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("mercury");

        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("submit")).click();

        //start validation here
        String expectedTitle = "Login: Mercury Tours";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Test is pass");
        }else{
            System.out.println("Test is failed");
        }

        //end validation here
        driver.close();
    }
}
