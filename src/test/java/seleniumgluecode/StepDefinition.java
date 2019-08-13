package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class StepDefinition {
	public static WebDriver driver;

	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/java/software/chromedriver3");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^user navigates to homepage$")
	public void user_navigates_to_homepage() throws Throwable {
		driver.findElement(By.linkText("Sign in")).click();

	}
	@Then("^message is displayed \"([^\"]*)\"$")
    public void message_is_displayed_something(String strArg1) throws Throwable {
		System.out.println(strArg1);
		driver.close();
    }

    @And("^user enters username with \"([^\"]*)\"and password with \"([^\"]*)\"$")
    public void user_enters_username_with_somethingand_password_with_something(String strArg1, String strArg2) throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(strArg1);
    	driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(strArg2);  
    	driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

}