package Selenium_java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.Initiate_browser("chrome");
		br.lanchUrl("http://seleniumpractise.blogspot.com/2017/07/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[1]")).click();
		Set<String> handlers=driver.getWindowHandles();
		
		Iterator<String> it=handlers.iterator();
		
		String parentWindowId=it.next();
		System.out.println("parent window id is"+parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("child window id is"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
	}

}
