package Collection;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 
		List<Integer> lst =new ArrayList<Integer>();


		lst.add(10);
		lst.add(20);
		lst.add(30);

		
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i));
		}

	}
	
	*/
	
	System.setProperty("webdriver.chrome.driver","C:/Program Files/Selenium/Selenium software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("http://localhost:100");
	driver.navigate().to("http://localhost:100");
	List<String> l = new ArrayList<String>();
	Select s =new Select(driver.findElement(By.name("login_theme")));
	System.out.println("Default selection should be blue" + s.getFirstSelectedOption().getText());
	List<WebElement> ls = s.getOptions();
	System.out.println(ls.size());
	System.out.println("Print all Values");
	for(WebElement e:ls)
	{
		System.out.println(e.getText());
		l.add(e.getText());
	}
	
	
	
	

}
	}
