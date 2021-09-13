package Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClasses {
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.Initiate_browser("chrome");
		
		Actions an= new Actions(driver);
		//Drag and drop
		br.lanchUrl("http://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		WebElement parent=driver.findElement(By.cssSelector("div#draggable"));
		WebElement child=driver.findElement(By.cssSelector("div#droppable"));
		//an.dragAndDrop(parent, child).build().perform();
		an.clickAndHold(parent).release(child).build().perform();
		
		//Right click
		br.lanchUrl("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement rc=driver.findElement(By.cssSelector("span.context-menu-one.btn"));
		an.contextClick(rc).build().perform();
		List<WebElement> lwb=driver.findElements(By.cssSelector("li.context-menu-item"));
		for (int i=0; i<lwb.size(); i++) {
			String s= lwb.get(i).getText();
			if(!s.isEmpty()) {
				System.out.println(s);
			}
			
		}
		
		//Mouse over
		br.lanchUrl("https://the-internet.herokuapp.com/jqueryui/menu");
		driver.manage().window().maximize();
		WebElement mo=driver.findElement(By.cssSelector("li#ui-id-3"));
		an.moveToElement(mo).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("li#ui-id-8")).click();
	}

}
