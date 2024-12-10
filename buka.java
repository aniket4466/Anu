package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Script;
import org.openqa.selenium.support.ui.Sleeper;

import java.util.Iterator;
import java.util.Set;

import static org.example.newo.driver;

public class buka {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        driver = new ChromeDriver(options);
        options.addArguments("--remote allow origins");
        driver.get("https://www.adda247.com/my-purchase/22846/regulatory-bodies-so-mahapack-by-adda247/exams");
        driver.manage().window().maximize();
       // driver.close();


        driver.get("https://www.programiz.com/java-programming");
        driver.manage().window().maximize();
        ((JavascriptExecutor)driver).executeScript("window.open('https://www.instagram.com/'),'_blank')");

        Set<String> windowHandels=driver.getWindowHandles();
        Iterator <String> iterator=windowHandels.iterator();
        String firsttab = iterator.next();
        String secondtab = iterator.next();
        driver.switchTo().window(firsttab);

        Thread.sleep(5000);
        driver.switchTo().window(secondtab);






    }
}
