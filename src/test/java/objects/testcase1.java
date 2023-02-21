package objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import althuraiclass.login;

public class testcase1 {
	WebDriver driver;
	
 
	@BeforeSuite

	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Toshiba\\eclipse-workspace\\EllingtonmavenV1\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://thuriahdev.crm4.dynamics.com/");
		driver.manage().window().maximize();
		
	}		

        @Test()
        public void login() throws Exception  {         	
       
        	login login = new login(driver);
        	Thread.sleep(2000);
        	login.loginnametext("ds@metadatacorp.com");
        	 Thread.sleep(2000);
        	login.submitbutton();
        	 Thread.sleep(2000);
        	login.passwordtext("PropertyXrm@2019");
        	 Thread.sleep(2000);
        	login.nextbutton();
        	 Thread.sleep(2000);
        	login.next1button();   	
        	 Thread.sleep(22000); 
        	driver.navigate().to("https://thuriahdev.crm4.dynamics.com/main.aspx?appid=e65c7b5d-b9a8-eb11-b1ac-000d3adb56a8&pagetype=entitylist&etn=md_project&viewid=f88af77f-7bf7-46a6-b606-c8d096b9880f&viewType=1039");  
        	Thread.sleep(12000);
        	
        }         
        

       
}
       