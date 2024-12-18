package day02driverMethodlari_webElementKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_DriverManageMethodlari {

    public static void main(String[] args) {

      /*
      Test otomasyonu
      bizim kodlarimizin bizim yerimize
      internette web sayfalarinda islem yapmasidir

      Bizim yazdigimiz Java kodlarinin hizi ile
      1-bilgisayarimiz
      2-internetimiz
      3-ulasmaya calistigimiz sayfanin hizlari arasinda fark olur

      Bu hizlar arasindaki fark kodlarimizin calisamamasina
      veya testin failed olmasina sbeep olur
       */

        System.setProperty("WebDriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
        Thread.sleep Java'dan gelir ve mutlak bir bekleme suresidir
        icine yazilan sure boyunca kodlari bekletir ve
        alt satira gecmez

        implicitlyWait(Duration.ofSeconds(10)) ise
        Selenium'dan gelir ve dinamiktir
        Yani 10 saniyeyi sonuna kadar kullanmaz
        asil amac sayfanin acilmasi veya
        sayfada kullanacagimiz herhangi bir webelementin kullanilir hale gelmesini beklemektir

        10 saniye icerisinde sayfanin acilmasini veya kullanacagi webElementi bulmayi bekler
        10 saniye icerisinde ne zaman islemi yapabilirse daha fazla beklemez, yoluna devam eder
        10 saniye beklemesine ragmen sayfa acilmazsa veya aradigi webElementi bulamazsa
        Expection firlatir ve calismayi durdurur
         */
    }
}
