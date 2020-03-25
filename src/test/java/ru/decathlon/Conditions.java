package ru.decathlon;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Conditions {
    public WebDriver driverCr, driverEg, driverFf;

    @Before
    public void start() {
        driverCr = new ChromeDriver();
        driverEg = new EdgeDriver();
        driverFf = new FirefoxDriver();
    }

    @After
    public void finish(){
        driverCr.quit();
        driverCr=null;
        driverEg.quit();
        driverEg=null;
        driverFf.quit();
        driverFf=null;
    }
}
