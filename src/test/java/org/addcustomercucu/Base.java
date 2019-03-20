package org.addcustomercucu;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Base {
	
		static WebDriver driver;
		
		public WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhu\\Addcustomer\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
			
		return driver;
		
		 }
		//method1 
		public void loadurl(String url) {
			driver.get(url);
			}
		//method2 
		public void type(WebElement element,String name) {
			element.sendKeys(name);
			
			}
		
		//method3 
		public void btnclick(WebElement element) {
			element.click();
			}
		//method4 
		public void quitbrowser  () {
			driver.quit();
			}
	//method5 close 
		public void closebrowser() {
			driver.close();
		}
		
		//method6 get 
		public void gettitlte(String title) {
			driver.getTitle();
			}
		
		//method7 get 
		public void switchtodefaultcontent() {
			driver.switchTo().defaultContent();
		}
		
		//method8
		public void selectbyvisibletext(WebElement element, String name) {
			Select s=new Select(element);
			s.selectByVisibleText(name);
			}
		//method9
		public void draganddrop(WebElement s, WebElement d) {
			Actions acc=new Actions(driver);
			acc.dragAndDrop(s,d).perform();
			}
		//method10
		public void moveToElement(WebElement phonenumber) {
			Actions acc=new Actions(driver);
			acc.moveToElement(phonenumber).perform();
			}
		
		//method11
		public void selectByValue(WebElement element, String username) {
			Select s=new Select(element);
			s.selectByValue(username);
		}
		 public void rightclick(WebElement name) {
			 Actions acc=new Actions(driver);
			 acc.contextClick(name).perform();
			 
		}
		 
		//method12
		 public void doubleclick(WebElement element){
			Actions acc=new Actions(driver);
			acc.doubleClick(element).perform();
		 }	
	//method13
		 public void keyupkeydown(WebElement s) {
			 Actions acc=new Actions(driver);
			 acc.keyDown(s, Keys.SHIFT).sendKeys(s,"" );
			 acc.keyUp(s, Keys.SHIFT).perform();
			 
			 }
		 
		 //method14
		 
	public void Alertaccept() {
		Alert a=driver.switchTo().alert();
		a.accept();
		}
	//method15
	public void Alertdismiss() {
		Alert a=driver.switchTo().alert();
		a.dismiss();
		}
	//method16
	public void Alertsendkeys(String name) {
	Alert sk=driver.switchTo().alert();
	sk.sendKeys(name);
	}

	//method17
	public void Alertgettext() {
		Alert gt=driver.switchTo().alert();
		gt.getText();
	}

		//method18
		
	public void TakeScreenShot(String filepath) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(filepath);
		Files.copy(source, destination);
		}
	//method19
	public void defaultcontent() {
		driver.switchTo().defaultContent();
	}

	//method20
	public void getattribute(WebElement element,String name) {
		String attribute= element.getAttribute(name);
		System.out.println(attribute);
	}

	//method21

	public void ismultiple(WebElement multiple) {
		Select s=new Select(multiple);
		boolean b = s.isMultiple();
		System.out.println(b);
		
	}

	//method22
	public void implicitwait(long milleseconds) {
		driver.manage().timeouts().implicitlyWait(milleseconds, TimeUnit.SECONDS);
	}

	//method23

	public void deselectAll(WebElement element ) {
		Select s=new Select(element);
		s.deselectAll();
		}
	public void currenturl() {
		driver.getCurrentUrl();
	}
	//method24
	public void threadsleep(long milleseconds ) throws InterruptedException {
		Thread.sleep(milleseconds);
		}
	//method25
	public void FrameIndex(int index) {
		driver.switchTo().frame(index);
	}
	//method26
	public void Parentframe() {
		driver.switchTo().parentFrame();

	}

	//method27

	public void Parentwindow() {
		String parent= driver.getWindowHandle();
		System.out.println(parent);
	}

	//method28
	public void ExecuteScript(WebElement element, String value) {
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript(value, element);
	}

	//method29
	public void SelectByIndex(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
		
	}

	//method30
	public void getoption(WebElement element) {
		Select s=new Select(element);
		 List<WebElement> emp = s.getOptions();
		System.out.println(emp);

	}

	//method31
	public void allwindowsid() {
		Set<String> allwindows= driver.getWindowHandles();
		System.out.println(allwindows);
	}

	//method32
	public void GetAllSelectedoption(WebElement element) {
	Select ga=new Select(element);
	List<WebElement> list = ga.getAllSelectedOptions();
	for (WebElement x : list) {
		System.out.println(x.getText());
	}

	}
	//method33
	public void GetfirstSelectedoption(WebElement element) {
		Select gfs=new Select(element);
		WebElement li = gfs.getFirstSelectedOption();
		System.out.println(li.getText());
	}

	//method34
	public void Deselectbyindex(WebElement element, int index ) {
		Select dbi=new Select(element);
		dbi.deselectByIndex(index);
	}
	//method35
	public void DeselectByValue(WebElement element, String username) {
		Select dev=new Select(element);
		dev.deselectByValue(username);
	}
	//method36
	public void Deselectbyvisible(WebElement element, String name ) {
	Select dv=new Select(element);
	dv.deselectByVisibleText(name);
	}
}
