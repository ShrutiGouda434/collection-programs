

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Listbox {
	@Test
	public  void ListboxDemo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\git\\maven project\\mavenproject1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='List Box']")).click();
		driver.findElement(By.xpath("//a[.='List Box']/..//a[.='JQuery List Box']")).click();
		WebElement lb = driver.findElement(By.xpath("//select[@class='form-control pickListSelect pickData']"));
		Select s=new Select(lb);
	System.out.println(	s.isMultiple());//is it a multiselect listbox
System.out.println(s.getOptions().size());
List<WebElement> options = s.getOptions();
//sort all options in listbox
ArrayList<String>list=new ArrayList<String>();
for (WebElement option : options) {
	list.add(option.getText());
	
}
//System.out.println("before sorting-----" +list);//display array list contents
////Collections.sort(list);
////System.out.println("after sorting----"+list);
////sort elements using treeset
//TreeSet<String>ts=new TreeSet<String>(list);
////System.out.println("after sorting"+ts);//or
//for (WebElement option : options){
//	ts.add(option.getText());
//	}
//System.out.println(ts);







//print unique contents
//HashSet<String>hs=new HashSet<String>(list);
//System.out.println(hs);
	
	//print only duplicates
HashSet<String>hs=new HashSet<String>();
	for (WebElement option : options) {
		if(!hs.add(option.getText())){
			System.out.println(hs);
		}
		
	}
	System.out.println(hs.size());
	}
	
}
