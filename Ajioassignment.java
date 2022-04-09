package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajioassignment {
	public static void main(String[] args) throws InterruptedException  {

		//1. Launch the URL https://www.ajio.com/

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();

		//2. In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags");

		//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.className("ic-search")).click();

		//4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(@for,'Men - Fashion Bags')]")).click();
		Thread.sleep(2000);
		String attribute = driver.findElement(By.xpath("//div[@class='length']")).getText();

		//5. Print the count of the items Found. 
		System.out.println(attribute);

		//6. Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> listofbags = driver.findElements(By.className("brand"));
		for (WebElement webElement : listofbags) {
			String text = webElement.getText();
			System.out.println(text);
		}
		//	7. Get the list of names of the bags and print it
		List<WebElement> listofbagsnames = driver.findElements(By.className("nameCls"));
		for (WebElement webElement : listofbagsnames) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

}
