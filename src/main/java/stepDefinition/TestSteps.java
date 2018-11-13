package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	String gikoDriverLoc = "C:\\Users\\Mahesh Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe";
	
	public static WebDriver driver;
	
	@Given("^User is at home page$")
	public void user_is_at_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", gikoDriverLoc);
		driver = new ChromeDriver();
		String webPage = "http://testing-ground.scraping.pro/login";	
		driver.get(webPage);
	    
	    
	}
	@When("^user enter username$")
	public void user_enter_username() throws Throwable {
		driver.findElement(By.id("usr")).sendKeys("admin");
	}
	@When("^password$")
	public void password() throws Throwable {
		driver.findElement(By.id("pwd")).sendKeys("12345");
	}
	@Then("^Message displayed \"([^\"]*)\"$")
	public void message_displayed1(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"case_login\"]/form/input[3]")).submit();
		String response = driver.findElement(By.className("success")).getText();
		System.out.println(response);
	}
	@When("^user logout from application$")
	public void user_logout_from_application() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"case_login\"]/a")).click();
	}
	@Then("^message displayed \"([^\"]*)\"$")
	public void message_displayed(String arg1) throws Throwable {
		System.out.println("Successfully logout");
	}
	@Then("^user will close the window$")
	public void user_will_close_the_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		driver.close();
	}

	
	

}
