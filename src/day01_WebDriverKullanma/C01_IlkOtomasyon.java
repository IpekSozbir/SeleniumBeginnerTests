package day01_WebDriverKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomasyon {

    public static void main(String[] args) throws InterruptedException {

        // Bir teste baslamadan once mutlaka
        // bir WebDriver edinmeliyiz

        // en ilkel haliyle WebDriver edinmek icin
        // Java'dan yardim alacagiz

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(3000);

        driver.quit();
    }
}
