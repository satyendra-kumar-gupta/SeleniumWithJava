package selenium.webdrivercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/*
 Use only for true of false
 */
public class ConditionalCommands {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        //isDisplayed() return true or false
        boolean flag = driver.findElement(By.xpath("//*[@id=\"email\"]")).isDisplayed();

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        System.out.println(flag);

        if(email.isDisplayed() && email.isEnabled()){
            email.sendKeys("saty@gmail.com ");
        }

        if(pass.isDisplayed() && pass.isEnabled()){
            pass.sendKeys("1234567890");
        }


        driver.quit();
    }
}
