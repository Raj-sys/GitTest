package gitTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstGitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();//suggested
		wd.manage().window().maximize();// to maximize// full screen()// firefox dont support
		wd.get("https://www.bing.com/");
		WebElement input = wd.findElement(By.name("q"));

		input.sendKeys("Chennai");
	}

}
