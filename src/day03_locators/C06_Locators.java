package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C06_Locators {

    public static void main(String[] args) throws InterruptedException {


        // 1- https://www.testotomasyonu.com/ adresine gidin
        System.setProperty("WebDriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.testotomasyonu.com/");


        // 2- Browseri tam sayfa yapin
        driver.manage().window().maximize();


        // 3- Sayfayi “refresh” yapin
        driver.navigate().refresh();


        // 4- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
        String expectedSayfaBasligiIcerik = "Test Otomasyonu";
        String actualSayfaBasligi = driver.getTitle();
        if (actualSayfaBasligi.contains(expectedSayfaBasligiIcerik)) {
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAILED");
        Thread.sleep(1000);


        // 5- Furniture linkine tiklayin
        driver.findElement(By.xpath("(//*[@class='has-sub'])[5]")).click();

        /*
            Bir HTML element acilan sayfada asagida kaldigi icin
            ilk acilan bolumde gorunmuyorsa
            o webElementi kullanip kullanamayacagimiz
            TAMAMEN sayfayi dizayn edenlerin yazmis olduklari koda baglidir
            bazi sayfalarda alt tarafta kalan HTML elementler kullanilabilirken
            bazi sayfalarda kullanilamayabilir

            Bizim yapabilecegimiz tek sey
            kullanmayi denemek
            kullanilabiliyorsa sorun yok,
            kullanamiyorsak o zaman sayfayi asagi kaydirmak

            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
         */


        // 6- Price range filtresinde min degere 40, max degere 200 yazip filtreleyin
        WebElement minFiyatKutusu = driver.findElement(By.xpath("//*[@*='form-control minPrice']"));
        minFiyatKutusu.clear();
        minFiyatKutusu.sendKeys("40");

        WebElement maxFiyatKutusu = driver.findElement(By.xpath("//*[@*='form-control maxPrice']"));
        maxFiyatKutusu.clear();
        maxFiyatKutusu.sendKeys("200");

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);


        driver.findElement(By.xpath("//*[@*='price-range-button']"))
                .click();



        // 7- Filtreleme sonucunda urun bulunabildigini test edin
        WebElement aramaSonucYaziElementi = driver.findElement(By.xpath("//*[@*='product-count-text']"));
        String unExpectedYazi = "0 Products Found";
        String actualYazi = aramaSonucYaziElementi.getText();

        if (! unExpectedYazi.equals(actualYazi)) {
            System.out.println("Filtreleme testi PASSED");
        } else System.out.println("Filtreleme testi FAILED");


        // 8-Ilk urunu tiklayin
        driver.findElement(By.xpath("(//*[@*='product-box mb-2 pb-1'])[1]"))
                .click();


        // 9- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin
        WebElement ilkUrunFiyatElementi = driver.findElement(By.id("priceproduct"));
        String fiyatStr = ilkUrunFiyatElementi.getText();
        fiyatStr = fiyatStr.replaceAll("\\D","");
        double fiyatDbl = Double.parseDouble(fiyatStr) / 100;
        if (fiyatDbl>=40 && fiyatDbl<=200)  {
            System.out.println("Ilk urun fiyat testi PASSED");
        } else System.out.println("Ilk urun fiyat testi FAILED");


        // 10-Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();
    }
}
