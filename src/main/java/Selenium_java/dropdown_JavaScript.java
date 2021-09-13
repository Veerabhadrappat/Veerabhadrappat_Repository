package Selenium_java;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropdown_JavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.Initiate_browser("chrome");
		br.lanchUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		br.selectDropdownValues("justAnInputBox", "comboTreeItemTitle", "choice 3", "choice 4");
		
		

	}

}
