package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class definition {
	WebDriver driver;
	
	
	@Given("I should be in login page")
	public void i_should_be_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TejaswiMalavalli\\Documents\\SDET Training\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String uname) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
	}
	@When("I enter password as {string}")
	public void i_enter_password_as(String pass) throws InterruptedException {
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		Thread.sleep(2000);
	}
	@When("I click on submit button")
	public void i_click_on_submit_button() throws InterruptedException {
		driver.findElement(By.id("btnLogin")).click();
	    Thread.sleep(3000);
	}
	@Then("I should see username as {string}")
	public void i_should_see_username_as(String Expected) throws InterruptedException {
		String Actual = driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(Expected, Actual);
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
	    Thread.sleep(2000);
	    driver.close();
	}

}
