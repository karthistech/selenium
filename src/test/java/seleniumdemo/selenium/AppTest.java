package seleniumdemo.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
       System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("http://www.google.co.in");
       Thread.sleep(5000);
       driver.quit();
    }
}
 