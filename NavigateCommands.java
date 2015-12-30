// this file is now connected to github
//starting branch1_test
package automationFramework;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigateCommands {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driverff = new FirefoxDriver();
		
		String URL = "http://www.DemoQA.co.il"; //was .com
		driverff.get(URL);

		driverff.findElement(By.xpath("/html/body/div/div/div[2]/aside[1]/div[2]/div/ul/li/a")).click();
		
		driverff.navigate().back();
		
		driverff.navigate().forward();
		
		driverff.navigate().to(URL);
		
		driverff.navigate().refresh();
		//driver.close();
	}

}
