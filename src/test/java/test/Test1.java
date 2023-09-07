package test;
import java.awt.geom.Area;
import java.beans.JavaBean;
import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.remote.http.HttpRequest;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
 public static void main(String[] args) throws IOException, InterruptedException {
	 		
	System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
	 WebDriver driver = new EdgeDriver();
//	//Web element bulma
//	driver.get("https://demoqa.com/text-box");
//	driver.manage().window().maximize();
//	WebElement nameElement = driver.findElement(By.id("userName"));
//	nameElement.click();
//	nameElement.sendKeys("Mehmet");
//	WebElement email = driver.findElement(new By.ByCssSelector("input.mr-sm-2[placeholder=\"name@example.com\"]"));
//	email.click();
//	email.sendKeys("mehmet@gmail.com");
//	WebElement address = driver.findElement(By.id("currentAddress"));
//	address.click();
//	address.sendKeys("İzmir/Türkiye");
//	WebElement pAddress = driver.findElement(By.id("permanentAddress"));
//	pAddress.click();
//	pAddress.sendKeys("İzmir/Türkiye");
//	WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
//	submitButton.click();
//	WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
//	WebElement emailText = driver.findElement(By.xpath("//div/p[@id='email']"));
//	WebElement addressText = driver.findElement(By.xpath("//div/p[@id='currentAddress']"));
//	WebElement pAddressText = driver.findElement(By.xpath("//div/p[@id='permanentAddress']"));
//	
//	System.out.println(nameText.getText());
//	System.out.println(emailText.getText());
//	System.out.println(addressText.getText());
//	System.out.println(pAddressText.getText());
//	    Checkbox tıklama
//	driver.get("https://demoqa.com/checkbox");
//	driver.manage().window().maximize();
//	WebElement homeCheckBox = driver.findElement(new By.ByCssSelector("label[for=\"tree-node-home\"] span.rct-checkbox svg"));
//	homeCheckBox.click();
//	homeCheckBox = driver.findElement(new By.ByCssSelector("label[for=\"tree-node-home\"] span.rct-checkbox svg"));
//	
//	String homeCheckBoxClassName = homeCheckBox.getAttribute("class");
//	if(homeCheckBoxClassName.equals("rct-icon rct-icon-check")) {
//		System.out.println("Checked!");
//	}else {
//		System.out.println("Unchecked!");
//	}
//			CheckBox 2
//	 driver.get("https://demoqa.com/automation-practice-form");
//	 driver.manage().window().maximize();
//	 WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
//	 System.out.println(sportCheckBox.isEnabled());
//	 WebElement sportChechBoxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));
//	 try {
//		 System.out.println("Try");
//		 sportCheckBox.click();
//	 }catch (ElementClickInterceptedException e) {
//		sportChechBoxLabel.click();
//		System.out.println("Catch");
//	}
//	            Radio Button
//	 driver.get("https://demoqa.com/radio-button");
//	 driver.manage().window().maximize();
//	 
//	 WebElement yesRadioButtonLabel = driver.findElement(new By.ByCssSelector("label[for=\"yesRadio\"]"));
//	 if(yesRadioButtonLabel.isEnabled()) {
//		 yesRadioButtonLabel.click();
//		 System.out.println("Clicked yes.");
//	 }
//	 WebElement yesRadioButton = driver.findElement(new By.ByCssSelector("input[id=\"yesRadio\"]"));
//	 if(yesRadioButton.isSelected()) {
//		 System.out.println("Yes is selected.");
//	 }
//	 WebElement output = driver.findElement(new By.ByCssSelector("p.mt-3"));
//	 System.out.println(output.getText());
//	 			Tıklama
//	 driver.get("https://demoqa.com/buttons");
//	 driver.manage().window().maximize();
//	 
//	 WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
//	 Actions action = new Actions(driver);
//	 action.doubleClick(doubleClickBtn).perform();
//	 WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
//	 action.contextClick(rightClickBtn).perform();
//	 WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
//	 System.out.println(doubleClickMessage.getText());
//	 WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
//	 System.out.println(rightClickMessage.getText());
	 // dinamik tıklama	 
//	 driver.get("https://demoqa.com/buttons");
//	 driver.manage().window().maximize();
//	 
//	 WebElement dynamicClickButton = driver.findElement(By.xpath("//div/button[starts-with(text(),'Click Me')]"));
//	 
//	 dynamicClickButton.click();
	
	 		//dinamik
//	 driver.get("https://demoqa.com/dynamic-properties");
//	 driver.manage().window().maximize();
//	 WebElement textElement = driver.findElement(By.xpath("//div/p"));
//	 System.out.println(textElement.getText());
	 
//	 WebElement firstButton = driver.findElement(By.id("enableAfter"));
//	 WebDriverWait wait = new WebDriverWait(driver, 5);
//	 wait.until(ExpectedConditions.elementToBeClickable(firstButton));
//	 firstButton.click();
	 
//	 WebElement colorChangeButton = driver.findElement(By.id("colorChange"));
//	 String className = colorChangeButton.getAttribute("class");
//	 System.out.println(className);
//	 WebDriverWait wait = new WebDriverWait(driver, 5);
//	 wait.until(ExpectedConditions.attributeToBe(colorChangeButton, "class", "mt-4 text-danger btn btn-primary"));
//	 className = colorChangeButton.getAttribute("class");
//	 System.out.println(className);
//	 
//	 WebDriverWait wait = new WebDriverWait(driver, 5);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
//	WebElement lastButton = driver.findElement(By.id("visibleAfter"));
//	lastButton.click();	 
//	          Http bağlantısı
//	 CloseableHttpClient client =  HttpClientBuilder.create().build();
//	 HttpGet request = new HttpGet("http://the-internet.herokuapp.com/status_codes/500");
//	 CloseableHttpResponse response = client.execute(request);
//	 int statusCode = response.getStatusLine().getStatusCode();
//	 System.out.println(statusCode);
	 //Kırık png
//	 driver.get("https://demoqa.com/broken");
//	 WebElement brokenImage = driver.findElement(By.xpath("//div/img[2]"));	 
//	 String URL = brokenImage.getAttribute("src");
//	 CloseableHttpClient client =  HttpClientBuilder.create().build();
//	 HttpGet request = new HttpGet(URL);
//	 CloseableHttpResponse response = client.execute(request);
//	 int statusCode = response.getStatusLine().getStatusCode();
//	 System.out.println(statusCode);
	 //düzgün png
//	 driver.get("https://demoqa.com/broken");
//	 WebElement brokenImage = driver.findElement(By.xpath("//div/img[1]"));	 
//	 String URL = brokenImage.getAttribute("src");
//	 CloseableHttpClient client =  HttpClientBuilder.create().build();
//	 HttpGet request = new HttpGet(URL);
//	 CloseableHttpResponse response = client.execute(request);
//	 int statusCode = response.getStatusLine().getStatusCode();
//	 System.out.println(statusCode);
	 //download
//	 driver.get("https://demoqa.com/upload-download");
//	 WebElement downloadButton = driver.findElement(By.id("downloadButton"));
//	 downloadButton.click();
//	 Thread.sleep(5000);
//	 String path = "/Users/Egemen/Downloads";
//	 String fileName = "sampleFile.jpeg";
//	 
//	 File file = new File(path);
//	 File[] files =  file.listFiles();
//	 boolean isDownloaded = false ; 
//	 for(int i = 0 ; i<files.length;i++) {
//		 if(files[i].getName().equals(fileName)) {
//			 System.out.println("File downloaded");		
//			 isDownloaded = true;
//			 break;
//		 }
//		 isDownloaded = false;
//	 }
//	 System.out.println(isDownloaded);
	 //upload
//	 driver.get("https://demoqa.com/upload-download");
//	WebElement uploadButton = driver.findElement(By.id("uploadFile"));
//	 uploadButton.sendKeys("C:\\Users\\Egemen\\Desktop\\Yeni Microsoft Word Belgesi.txt");
	 //window tab
//	 driver.get("https://demoqa.com/browser-windows");
//	 WebElement tabButton = driver.findElement(By.id("tabButton"));
//	 tabButton.click();
//	 
//	 List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//	 
//	 driver.switchTo().window(tabs.get(1));
//	 driver.switchTo().window(tabs.get(0));
	 //alert
//	 driver.get("https://demoqa.com/alerts");
//	 driver.findElement(By.id("confirmButton")).click();
//	 driver.switchTo().alert().accept();
	 
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
}
