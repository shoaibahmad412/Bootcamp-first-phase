import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.applet.Applet;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.util.concurrent.TimeUnit;


public class exercisehome {
	private final static Logger log = LoggerFactory.getLogger(Applet.class);
	public exercisehome() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		log.error("Success");
		
	
			WebDriverManager.chromedriver().setup();
			
			
			
			 WebDriver driver = new ChromeDriver();
			 //Accessing the website by hitting the particular url
			driver.get("https://omayo.blogspot.in/");
			String pageTitle= driver.getTitle();
			System.out.println("Title of the web page: " + pageTitle);
			
			//Getting the input value and then verifing it by assertion command
			
			WebElement textinput= driver.findElement(By.xpath("//div[@id=\"HTML2\"]//div//textarea"));
			textinput.sendKeys(("my name is shoaib ahmad."));
			
			
			
			
			
			
			
			
			
			
			
			//Click the try it button
			WebElement tryit= driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
			tryit.click();
			System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			System.out.println("The button is disabled by user after 3 seconds");
			
			//Double click
			 try {
		            WebElement DoubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));

		            Actions actions = new Actions(driver);
		            actions.doubleClick(DoubleClick).perform();

		            System.out.println("Double-clicked the element.");
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			 Alert alert = driver.switchTo().alert();
			  alert.accept(); 
		      driver.switchTo().defaultContent();
			
			//Check this button enabling
		      WebElement Checkbutton = driver.findElement(By.xpath("//button[contains(text(),'Check this')]"));
		      Checkbutton.click();
		      
		     
		      
		      
		      System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
		      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		      System.out.println("The check button is enabled by user after 10 seconds");
		        
		      WebElement Checkbox = driver.findElement(By.id("dte"));
			  Checkbox.click();
			  
			  
			  //Click on green drop down
			  
			  WebElement Dropdown = driver.findElement(By.xpath("//button[contains(text(),'Dropdown')]"));
			  Dropdown.click();
			  

			  WebElement Dropface = driver.findElement(By.xpath("//div[@id=\"myDropdown\"]//a[contains(text(),'Facebook')]"));
			  Dropface.click();
			
			
			
			
			
			
			

	}

}
