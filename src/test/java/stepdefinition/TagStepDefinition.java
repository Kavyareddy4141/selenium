package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagStepDefinition {
	WebDriver driver;
	@Given("user open login page")
	public void user_open_login_page() throws InterruptedException {
		driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   Thread.sleep(2000);
	}

	@When("user enters valid data")
	public void user_enters_valid_data() {
		driver.findElement(By.name("username")).sendKeys("un");
	    driver.findElement(By.name("password")).sendKeys("pass");
	}

	@When("click on login")
	public void click_on_login() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user login successfully")
	public void user_login_successfully() {
		System.out.println("user on home page ");  
	}



}
