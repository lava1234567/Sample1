package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriver browserName(String bname) {

		switch(bname) {                           //webdriver methods
		
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
		case "firefox":
			
		    WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
            break;
		case "edge":
			
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.manage().window().maximize();
            break;
		} return driver;
			
	}
	
	public static void implicitlyWait(int a) {
     driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}
	 public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	 public static String getTitle() {
		 String title = driver.getTitle();
		return title;

	}
	 public static String getCurrentUrl() {
          String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		 
	}
	 public static String getWindowHandle() {
 String windowHandle = driver.getWindowHandle();
return windowHandle;
	}
	 public static Set<String> getWindowHandles() {
     Set<String> windowHandles = driver.getWindowHandles();
	return windowHandles;
	}
	 public static void quit() {
      driver.quit();
	}
	 public static void close() {
		driver.close();

	}
	 
	 //webelement methods
//	 public static WebElement findElement(String id) {
//     WebElement findElement = driver.findElement(By.id(id));
//	 return findElement;
//	}
//	 
//	 public static WebElement findElement1(String name) {
//     WebElement findElement1 = driver.findElement(By.name(name));
//	return findElement1;
//	}
	 public static void sendKeys(WebElement e,String s) {
     e.sendKeys(s);
	}
	 public static void click(WebElement e) {
     e.click();
	}
	 public static void clear(WebElement e) {
     e.clear();
	}
	 public static String getAttribute(WebElement e, String name) {
     String attribute = e.getAttribute(name);
	return attribute;                                       //both getAttribute and getUserText are same to get the value that we provide
	} 
	 public static String getUserText(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}
    //mouse actions
	 
	 
	 public static void moveToElement(WebElement e) {
			Actions a=new Actions(driver);
		 a.moveToElement(e).perform();
	 }
	 public static void mouseClick(WebElement e) {
      e.click();	
      
	 }
	 //select methods

	 public static void selectByIndex(WebElement e,int i) {
      Select s=new Select(e);
	  s.selectByIndex(i);
     	  
	}	 
	 public static void selectByValue(WebElement e,String st) {
	      Select s=new Select(e);
		  s.selectByValue(st);
	     	  
		}	 
	 public static void selectByVisibleText(WebElement e,String st) {
	      Select s=new Select(e);
		  s.selectByVisibleText(st);
	     	  
		}	 
      //data driven
	 public static String readFromExcel(String Filename, String sheet, int row, int cell) throws IOException {

		 File f=new File("C:\\Users\\lavan\\eclipse-workspace\\TestMaven\\src\\test\\resources\\"+Filename+".xlsx");
		FileInputStream fi=new FileInputStream(f);
			
	        Workbook w=new XSSFWorkbook(fi);
	        Sheet s = w.getSheet(sheet);
	        Row r = s.getRow(row);
	        Cell c = r.getCell(cell);
	        int cellType = c.getCellType();
	        String value=null;

	        if(cellType==1) {
	        	 value = c.getStringCellValue();
	        }
	        else {
	        	if(DateUtil.isCellDateFormatted(c)) {
	        		Date dateCellValue = c.getDateCellValue();
	        		SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
	        		 value = sd.format(dateCellValue);
	        		
	        	}else {
	        		double numericCellValue = c.getNumericCellValue();
	        		long ph=(long) numericCellValue;
	        	     value = String.valueOf(ph);
	        	}
	        	
	        }
			return value;
	       	
		}
		 //to send values through javascript
	 public static void javaScriptss(String userid, WebElement element) {

		 JavascriptExecutor js=(JavascriptExecutor) driver;
	     js.executeScript("arguments[0].setAttribute('value','"+userid+"')",element);
		 
	}
	 //get options
	 
	 public static List getOptions(WebElement element) {
		 Select s=new Select(element);
		 String text = null;
		 List l=new LinkedList();
		 List<WebElement> options = s.getOptions();
		 for(int i=0;i<options.size();i++) {
			  text = options.get(i).getText();
			  l.add(text); 
		 }
		return l;
		}	
	 
	 //switching into another window
	 public static void windowSwitching(int i) {
         int count=1;
		 Set<String> windowHandles = driver.getWindowHandles();
		 for(String x:windowHandles) {
			 if(count==i) {
				 driver.switchTo().window(x);
			 }
			 count++;
		 }
		 
	}
	 //scrolldown to the particular element
	 public static void scrollDown(String downOrup, WebElement element ) {

		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView("+downOrup+")", element);
	}
	 
	}

