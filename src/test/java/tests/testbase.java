package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class testbase extends AbstractTestNGCucumberTests
{
    public static WebDriver driver;
    @BeforeSuite
    public void statrdriver()
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.jumia.com.eg/");
    }
    

//    @AfterSuite
//    public void stopdriver()
//    {
//        driver.quit();
//    }


    
}