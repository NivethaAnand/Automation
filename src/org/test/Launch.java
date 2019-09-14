package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nishanthi\\Desktop\\Nivetha\\ActionsClass\\dri\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
				
				WebElement day = driver.findElement(By.id("month"));
				Select s= new Select(day);
				s.selectByIndex(3);
				s.selectByValue("Mar");
				System.out.println(s.getOptions());
				System.out.println();
				System.out.println(s.getFirstSelectedOption());
				//To get the value of the drop down
				List<WebElement> p = s.getOptions();
				for (WebElement x : p) {
					System.out.println(x.getText());
				}
				
				
				
				
	}
}
