package Selenium.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.id("Email")).sendKeys("rahulray_1995@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("Testing@123");
        driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/butto")).click();


    }
}
