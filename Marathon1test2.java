package homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Marathon1test2 {
	public static void main(String[] args) throws InterruptedException {
    //launch the browser
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
	//load the url
	driver.get("https://www.amazon.in/");
	//maximize the window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
	//search bags for boys
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
	Thread.sleep(5000);
	//select bags for boys
	driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1']")).click();
	//to print the search result
	String tt=driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
	System.out.println(tt);
	Thread.sleep(2000);
	//expand see more
	driver.findElement(By.xpath("(//span[@class='a-expander-prompt'])[2]")).click();
	Thread.sleep(2000);
	//select american tourister
	driver.findElement(By.xpath("//span[text()='American Tourister']")).click();
	Thread.sleep(7000);
	//expand see more
	driver.findElement(By.xpath("(//span[@class='a-expander-prompt'])[2]")).click();
	Thread.sleep(3000);
	//select frantic
	driver.findElement(By.xpath("//span[text()='Frantic']")).click();
	Thread.sleep(7000);
	//click on sort
	driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
	Thread.sleep(10000);
	//select new arrivals
	driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	Thread.sleep(3000);
	//to get the text of first one from search
	String ss=driver.findElement(By.xpath("//span[contains(text(),'Multiple Pockets & Daily-Use Ready ')]")).getText();
	System.out.println(ss);
	//to get the title
	driver.getTitle();
	Thread.sleep(8000);
	//close the window
	driver.close();
	}	        
}
