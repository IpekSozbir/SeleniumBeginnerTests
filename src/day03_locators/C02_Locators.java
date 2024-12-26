package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C02_Locators {

    public static void main(String[] args) throws InterruptedException {

        // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("WebDriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // 2- http://zero.webappsecurity.com/ adresine gidin
        driver.get("http://zero.webappsecurity.com/");


        // 3- “ONLINE BANKING” linkine tiklayin
        WebElement onlineBankingLink = driver.findElement(By.id("onlineBankingMenu"));
        onlineBankingLink.click();
        // sadece click yapacagimiz icin ve
        // gorevde yapilacak islem aciklandigi icin (tek bir click islemiyse gorev)
        // bir WebElement olusturmadan locate edip direkt click yapabiliriz
        // driver.findElement(By.id("onlineBankingMenu")).click();


        // 4- Resim altinda 6 islem basligi oldugunu test edin
        List<WebElement> baslikelementleriList = driver.findElements(By.className("headers"));
        int expectedBaslikSayisi = 6;
        int actualBaslikSayisi = baslikelementleriList.size();
        if (expectedBaslikSayisi==actualBaslikSayisi) {
            System.out.println("Baslik Sayisi Testi PASSED");
        } else  System.out.println("Baslik Sayisi Testi FAILED");


        // 5- Islem basliklari icinde “Pay Bills” oldugunu test edin
        List<String> baslikListesiStr = new ArrayList<>();
        for (WebElement eachBaslik : baslikelementleriList) {
            baslikListesiStr.add(eachBaslik.getText());
        }
        String expectedBaslikIsmi = "Pay Bills";
        if (baslikListesiStr.contains(expectedBaslikIsmi)) {
            System.out.println("Pay Bills Testi PASSED");
        } else System.out.println("Pay Bills Testi FAILED");


        // 6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();
    }
}
