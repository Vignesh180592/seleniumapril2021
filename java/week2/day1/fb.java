package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElementById("search").sendKeys("vathiraidsong");
		driver.findElementByClassName("style-scope ytd-searchbox\"").click();
		// driver.findElementById("pass").sendKeys("mano2275");
		//driver.findElementByName("login").click();
		//driver.findElementByClassName("inputtext mrm").sendKeys("8270103311");
		 
		 //driver.findElementByClassName("fbx _-kb _605a g_k01uhkx-g chrome webkit win x1 Locale_ta_IN cores-gte4 hasAXNavMenubar _19_u\"").sendKeys("ramyaganesan");
		 
		
	}	
	}

