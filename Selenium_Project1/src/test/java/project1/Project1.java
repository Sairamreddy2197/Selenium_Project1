package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		driver.findElement(By.id("autocomplete")).sendKeys("Hyerabad");
		driver.findElement(By.id("street_number")).sendKeys("vizag");
		
		driver.findElement(By.id("route")).sendKeys("dgfjhd");
		driver.findElement(By.id("locality")).sendKeys("software");
		
		driver.findElement(By.id("administrative_area_level_1")).sendKeys("Telanaga");
		driver.findElement(By.id("postal_code")).sendKeys("502295");
		
		driver.findElement(By.id("country")).sendKeys("india");
		
		
	}

}
