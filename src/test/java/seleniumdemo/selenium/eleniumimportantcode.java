package seleniumdemo.selenium;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class eleniumimportantcode {

	@Test
	public void dropdown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://digit7.io/");
		

		List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@href,'https')]"));
		int count = elements.size();
		System.out.println("The count of the Links :" + count);

		/*
		 * 
		 * List<WebElement> list1 =
		 * driver.findElements(By.xpath("//select[@id='select-demo']/option"));
		 * for(WebElement element : list1) { System.out.println(element.getText()); }
		 * 
		 * Select select = new Select(driver.findElement(By.id("select-demo"))); int
		 * listSize = select.getOptions().size(); List<WebElement> list =
		 * select.getOptions(); if
		 * (list.get(listSize-1).getText().equalsIgnoreCase("saturday")) {
		 * System.out.println("Matches"); Assert.assertTrue(true); }else {
		 * System.out.println("Not Matches"); Assert.assertTrue(false); }
		 * 
		 * select.selectByIndex(0); select.selectByValue("Tuesday");
		 * select.selectByVisibleText("Monday");
		 * 
		 * 
		 * //***************************ALERTS***************************
		 * 
		 * driver.findElement(By.linkText("Alerts & Modals")).click();
		 * driver.findElement(By.linkText("Javascript Alerts")).click();
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click(); Alert
		 * alert = driver.switchTo().alert(); Thread.sleep(3000); alert.accept();
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click(); alert =
		 * driver.switchTo().alert(); Thread.sleep(3000); alert.dismiss();
		 * 
		 * 
		 * //******************* JAVA SCRIPT *****************************
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].setAttribute('style', arguments[1]);",driver.
		 * findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")
		 * ), "color: red; border: 2px solid red;");
		 * 
		 * //****************** WINDOW HANDLE ************************** String windowid
		 * = driver.getWindowHandle();
		 * 
		 * System.out.println("GetwindowHandle :" + windowid);
		 * 
		 * Set<String> set = driver.getWindowHandles();
		 * 
		 * for(String string:set) { System.out.println("GetwindowHandles :" + string); }
		 * 
		 * 
		 * //@@@@@@@@@@@@@@@@@@@@ WAIT @@@@@@@@@@@@@@@@@@@@@@@@@@22
		 * 
		 * Wait<WebDriver> wait = new WebDriverWait(driver,10);
		 * 
		 * WebElement state =
		 * wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.
		 * xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button"))));
		 * 
		 * System.out.println(state.getText()); Thread.sleep(5000); driver.quit();
		 * 
		 * Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
		 * .withTimeout(30,TimeUnit.SECONDS) .pollingEvery(5,TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class); WebElement web = wait1.until(new
		 * Function<WebDriver,WebElement>(){ public WebElement apply(WebDriver driver) {
		 * return driver.findElement(By.xpath(
		 * "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")); } });
		 * 
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 * driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		 */
	}

}
