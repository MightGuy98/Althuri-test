package althuraiclass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class login {
	WebDriver driver;
     

	By loginname =By.xpath("//input[@type='email']");//*[@id="tab3_32"]
	By submit =By.xpath("//input[@type='submit']");
	By password =By.xpath("//input[@id='i0118']");
	By next =By.xpath("//input[@type='submit']");
	By next1 =By.xpath("//input[@id='idSIButton9']");
	

	
	
	
	public  login(WebDriver driver) {
		this.driver=driver;
	}
	
	 
	public void loginnametext(String text ) {
	driver.findElement(loginname).sendKeys(text);
	}	
	public void submitbutton() {
	driver.findElement(submit).click();
	}
	public void passwordtext(String text) {
		driver.findElement(password).sendKeys(text);
		}
	public void nextbutton() {
		driver.findElement(next).click();
		}
	public void next1button() {
		driver.findElement(next1).click();
		}
	

	
	
	
	
}
	
