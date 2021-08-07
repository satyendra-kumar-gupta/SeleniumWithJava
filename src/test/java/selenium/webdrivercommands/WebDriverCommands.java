package selenium.webdrivercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverCommands {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/index.php"); // open the url
        System.out.println("Title of the page : "+driver.getTitle()); // get the title of current page
        System.out.println("Return the url of the page : " +driver.getCurrentUrl()); //get the url of the page
        ///html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b
        String text = driver.findElement
                (By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]" +
                "/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"))
                .getText();
        System.out.println(text);

        driver.close(); // close the current window
        //driver.quit();  // closes multiple browser or multiple windows
    }
}
