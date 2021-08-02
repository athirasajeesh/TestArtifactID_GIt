package TestProject.TestArtifactID;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchChrome {

	public static WebDriver driver;
	static String baseUrl;

	public static void launchChromeBrowser() {
		System.out.println("Opening Chrome Browser!");
		
		try {
		// Setting the webdriver
		setWebdriver();
		
		// Calling implicit wait method
		manageImplicitWait();

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		// get the actual value of the title
		actualTitle = driver.getTitle();

		 //compare the actual title of the page with the expected one and print the result as "Passed" or "Failed"
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
		}
		catch (Exception e) {
		System.out.println("Error" + e.getMessage());
		}
	}
	
	public static void setWebdriver() {
		// declaration and instantiation of Chrome
		System.setProperty("webdriver.chrome.driver", "E:\\Athira - WorkSpace\\Softwares\\Browsers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
	     baseUrl = "http://demo.guru99.com/test/newtours/";
	}
	
	public void maximiseWindow() {
		driver.manage().window().maximize();
	}

	public void mandatorySleep() throws InterruptedException {
		//Adding mandatory sleep for 2 seconds 
		//This will pause the execution for 2 seconds , thts all! This will slows down automation time generally
		Thread.sleep(2000);
	}
	
	
	@SuppressWarnings("deprecation")
	public static void manageImplicitWait() {
		//This wait is applicable to all webelements after this statement .We just need to put this statement only ones
		//Wait for 3 Seconds, if it found the elements within 3 seconds , it will move to next step. maximum amount of time it will wait is 3 seconds
		System.out.println("Waiting for 3 Seconds!");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@SuppressWarnings("deprecation")
	public void manageExplicitWait() {
		
		//Unlike the above scenerio if some webelement took more time to load, if you want to  wait for prolonged time.
		//Unlike Implicit waits, Explicit waits are applied for tht particular instance only.
		WebDriverWait waitBy= new WebDriverWait(driver, 3);
		WebElement isVisible= waitBy.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")));
		if(isVisible.isEnabled()) {
			System.out.println("WebElement is Found!");
		}
	}
	public void quitBrowser() {
		// close Fire fox
		driver.close();
		System.out.println("Closed Chrome Browser!");
	}


}
