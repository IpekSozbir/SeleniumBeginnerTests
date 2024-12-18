package day02driverMethodlari_webElementKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPractice3 {

    public static void main(String[] args) throws InterruptedException {

        // 1.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        // (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
        // yazdirin.
        System.setProperty("WebDriver.chrome.drive","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title test PASSED");
        } else System.out.println("Actual Title: " + actualTitle);


        // 2.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String expectedUrlIcerik = "facebook";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Url Testi PASSED");
        } else System.out.println("Actual Url: " + actualUrl);


        // 3.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");


        // 4. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedTitleIcerikW = "Walmart.com";
        String actualTitleW = driver.getTitle();

        if (actualTitleW.contains(expectedTitleIcerikW)) {
            System.out.println("Walmart Title Testi PASSED");
        } else System.out.println("Walmart Title Testi FAILED");


        // 5. Tekrar “facebook” sayfasina donun
        driver.navigate().to("https://www.facebook.com");


        // 6. Sayfayi yenileyin
        driver.navigate().refresh();


        // 7. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();


        // 8.Browser’i kapatin
        Thread.sleep(3000);
        driver.quit();
    }
}
