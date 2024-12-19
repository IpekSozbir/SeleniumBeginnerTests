package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPractice2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // 1- https://www.testotomasyonu.com/ sayfasına gidin.
        driver.get("https://www.testotomasyonu.com/");


        //2- Arama kutusuna “dress” yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("dress" + Keys.ENTER);


        //3- Görüntülenen sonuçların sayısını yazdırın
        WebElement sonucSayisiMetni = driver.findElement(By.className("product-count-text"));
        String sonucSayisiStr = sonucSayisiMetni.getText().replaceAll("\\D","");
        int sonucSayi = Integer.parseInt(sonucSayisiStr);
        System.out.println("Goruntulenen sonuc sayisi: " + sonucSayi);


        //4- Listeden ilk urunun resmine tıklayın.
        driver.findElement(By.xpath("(//*[@class='lazy'])[1]"))
                .click();


        //5- Urun detayinda dress kelimesi geçtiğini test edin.
        WebElement actualUrunDetay = driver.findElement(By.xpath("//*[@class='product-short-desc  my-2']"));
        String expectedUrunIcerik = "dress";
        String actualUrunDetayStr = actualUrunDetay.getText();

        if (actualUrunDetayStr.contains(expectedUrunIcerik)) {
            System.out.println("Urun Detay Icerik Testi PASSED");
        } else  System.out.println("Urun Detay Icerik Testi PASSED");


        // 6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();
    }
}
