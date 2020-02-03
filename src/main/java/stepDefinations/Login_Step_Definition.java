package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login_Step_Definition {

	WebDriver driver;

	@Given("^User is already on login page$")
	public void login_Prequisite() {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium_Practice\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("automationtesting007bheem@gmail.com");
		driver.findElement(By.name("password")).sendKeys("capgemini@12345");
	}

	/*
	 * @Then("^User clicks on Login button$") public void
	 * user_clicks_on_Login_button() {
	 * 
	 * WebElement loginBtn =
	 * driver.findElement(By.xpath("//input[@type='submit']")); JavascriptExecutor
	 * js = (JavascriptExecutor) driver; js.executeScript("arguments[0].click();",
	 * loginBtn);
	 * 
	 * }
	 * 
	 * @Then("^User is on Home page$")
	 * 
	 * public void user_is_on_hopme_page() { String title = driver.getTitle();
	 * System.out.println("Home Page title ::" + title);
	 * Assert.assertEquals("CRMPRO", title);
	 * 
	 * }
	 */
}
