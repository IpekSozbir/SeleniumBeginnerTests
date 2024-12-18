package day02driverMethodlari_webElementKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTestOtomayonu {

    public static void main(String[] args) throws InterruptedException {

        /*
    1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
    2. Sayfa basligini(title) yazdirin
    3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
    4. Sayfa adresini(url) yazdirin
    5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
    6. Sayfa handle degerini yazdirin
    7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
    8. Sayfayi kapatin.
         */

        System.setProperty("WebDriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();

        // 1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(3000);


        // 2. Sayfa basligini(title) yazdirin
        String actualTitle = driver.getTitle();
        System.out.println("Sayfa Title: " + actualTitle);


        // 3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
        String expectedTitleIcerik = "Test Otomasyonu";

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title testi FAILED");
        }


        // 4. Sayfa adresini(url) yazdirin
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Gidilen Url: "+ actualUrl);


        // 5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
        String expectedUrl = "https://testotomasyonu.com/";
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Url Testi PASSED");
        } else {
            System.out.println("Url Testi FAILED");
        }


        //6. Sayfa handle degerini yazdirin
        System.out.println("Acilan window'un windowHandle degeri: " + driver.getWindowHandle());


        //7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
        String expectedSayfaKaynagiIcerik = "otomasyon";
        String actualSayfaKaynagi = driver.getPageSource();

        if (actualSayfaKaynagi.contains(expectedSayfaKaynagiIcerik)) {
            System.out.println("Sayfa kaynagi testi PASSED");
        } else {
            System.out.println("Sayfa kaynagi testi FAILED");
        }


        //8. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.quit();
    }
}
