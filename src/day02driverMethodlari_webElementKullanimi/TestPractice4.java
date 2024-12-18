package day02driverMethodlari_webElementKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPractice4 {

    public static void main(String[] args) {

        //1. Yeni bir class olusturun
        System.setProperty("WebDriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Youtube web sayfasına gidin
        driver.get("https://www.youtube.com/");


        // ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        String expectedTitleIcerik = "youtube";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Youtube title testi PASSED");
        }else {
            System.out.println("Youtube title testi FAILED");
            System.out.println("Youtube title: "+ actualTitle);
        }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
        // içermiyorsa doğru URL'yi yazdırın.
        String expectedUrlIcerik ="youtube";
        String actualUrl= driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Youtube Url testi PASSED");
        }else {
            System.out.println("Youtube Url testi FAILED");
            System.out.println("Youtube Url: "+ actualUrl);
        }
        //4. Daha sonra testotomasyonu sayfasina gidin https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");

        //5. Youtube sayfasina geri donun
        driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Testotomasyonu sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //9. Ardından sayfa başlığının "Test" içerip içermediğini (contains) test edin,
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        String expectedTitleIcerik2 = "Test";
        String actualTitle2 = driver.getTitle();
        if (actualTitle2.contains(expectedTitleIcerik2)){
            System.out.println("Test otomasyonu title testi PASSED");
        }else {
            System.out.println("Test otomasyonu title testi FAILED");
            System.out.println("Test otomasyonu title: "+ actualTitle2);
        }
        //10.Sayfa URL'sinin https://www.testotomasyonu.com/ olup olmadığını test edin,
        // degilse doğru URL'yi yazdırın
        String expectedUrlIcerik2 ="https://www.testotomasyonu.com/";
        String actualUrl2 = driver.getCurrentUrl();
        if (actualUrl2.contains(expectedUrlIcerik2)){
            System.out.println("Test otomasyonu Url testi PASSED");
        }else {
            System.out.println("Test otomasyonu Url testi FAILED");
            System.out.println("Test otomasyonu Url: "+ actualUrl2);
        }

        //11.Sayfayi kapatin
        driver.quit();
    }
}
