package day02driverMethodlari_webElementKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPractice1 {

    public static void main(String[] args) throws InterruptedException {

        //1. https://www.testotomasyonu.com/ sayfasina gidin
        System.setProperty("WebDriver.chrome.drive","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.testotomasyonu.com/");


        //2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari: " + driver.manage().window().getSize());


        //3. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();


        //4. Simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();


        //5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin maximize halde konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin maximize halde boyutlari: " + driver.manage().window().getSize());


        //6. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();


        //7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin fullscreen halde konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin fullscreen halde boyutlari: " + driver.manage().window().getSize());


        //8. Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();
    }
}
