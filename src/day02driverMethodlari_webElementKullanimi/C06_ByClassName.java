package day02driverMethodlari_webElementKullanimi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_ByClassName {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.drive","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // testotomasyonu ana sayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // arama kutusuna phone yazip aratin
            // kodlarimiz ile reel browser'daki bir webElementi kullanabilmek icin
            // once o webElementi kodlarimizla tanimlayip bir obje olarak class'da kaydetmeliyiz
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone");
        aramaKutusu.submit();


        // arama sonucunda urun bulunabildigini test edin
            // bulunan  urunleri class attribute'u sayesinde toplu olarak locate edebiliyoruz
        List<WebElement> bulunanElementlerList =  driver.findElements(By.className("prod-img"));
        // className de bosluk varsa calismayabilir By.className
        int actualBulunanUrunSsyisi = bulunanElementlerList.size();

        if (actualBulunanUrunSsyisi>0) {
            System.out.println("Arama Testi PASSED");
        } else System.out.println("Arama Testi FAILED");


        // sayfayi kapatin
        Thread.sleep(2000);
        driver.quit();
    }
}
