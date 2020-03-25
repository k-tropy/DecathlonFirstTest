package ru.decathlon;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

//Bolgov Sergey

public class FirstTest extends Conditions{
        private String userName = "testMail@testMail.ru";
        private String password = "qwerty123456";
        private WebDriver driver;
    @Test
    public void firstTestDecathlon() throws InterruptedException {
        driver=driverCr;
        for (int i=1; i<=3; i++) {
            if (i > 1)
               {driver = (i == 2 ? driverFf : driverEg);}
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("Start test "+i);
            driver.get("https://www.decathlon.ru/");
            driver.findElement(By.linkText("Аккаунт")).click();
            driver.findElement(By.id("defaut.Email")).sendKeys(userName);
            driver.findElement(By.id("defaut.Password")).sendKeys(password);
            driver.findElement(By.id("defaut.Connecter")).click();
            Thread.sleep(10000);
            System.out.println("Finish test "+i);
        }
    }
}
