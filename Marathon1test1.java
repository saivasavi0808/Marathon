package homeassignments;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
public class Marathon1test1 {
	public static void main(String[] args) throws InterruptedException {
		//to launch the browser
		ChromeDriver driver=new ChromeDriver();
		//to load url
		driver.get("https://www.pvrcinemas.com/");
		//to maximize the window
		driver.manage().window().maximize();
		//click on cinema
		driver.findElement(By.className("cinemas-inactive")).click();
		//select cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		//select the theatre
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[text()='INOX Hyderabad SMR'])[1]")).click();
	    //select date
	    Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[2]")).click();
		//select movie
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();
		//select timing
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[3]")).click();
		//click on book
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		//click on accept
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//click on available seat
		Thread.sleep(2000);
		driver.findElement(By.id("CR.CLASSIC ROWS|N:4")).click();
		// Wait for summary to load and get grandtotal and seatinfo
		Thread.sleep(3000);
		String seatInfo = driver.findElement(By.xpath("//h6[contains(text(),'Seat')]")).getText();
		String g=driver.findElement(By.xpath("//p[text()='N4']")).getText();
		String c=driver.findElement(By.xpath("//p[text()='CLASSIC ROWS']")).getText();
		System.out.println("Seat Info: " + seatInfo + " " + g+" "+c);

		String grandTotal = driver.findElement(By.xpath("//div[contains(@class,'grand-prices')]/h6")).getText();
		System.out.println("Grand Total: " + grandTotal);
		//click on proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(7000);
		//close the popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		Thread.sleep(3000);
		//get the title of page
		driver.getTitle();
		Thread.sleep(9000);
		//closes the window
		driver.close();

		
	}

}
