package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_ByLinkTest {

    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("WebDriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        Thread.sleep(1000);
        // link sayisi testi failed verdi burada bir duraklatip denedik
        // passed oldu. Denenebilecek bir yontem


        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkElementleriList = driver.findElements(By.tagName("a"));
        int expectedLinkSayisi = 147;
        int actualLinkSayisi = linkElementleriList.size();

        if (expectedLinkSayisi==actualLinkSayisi) {
            System.out.println("Link sayisi testi PASSED");
        } else System.out.println("Link sayisi testi FAILED");


        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).click();


        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferYaziElementi = driver.findElement(By.id("sale_image"));
        if (specialOfferYaziElementi.isDisplayed()) {
            System.out.println("Special Offer yazi testi PASSED");
        } else System.out.println("Special Offer yazi testi FAILED");


        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();
    }
}
