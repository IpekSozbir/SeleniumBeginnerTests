package day02driverMethodlari_webElementKullanimi;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        // HTML kodlarin daha eriselibilir olmasi icin
        // her class'in basinda mutlaka
        // maximize yapariz
        driver.get("https://testotomasyonu.com");


        // acilistaki window size ve konumunu yazdirin
        System.out.println("Acilista boyut: " + driver.manage().window().getSize());
        System.out.println("Acilista konum: " + driver.manage().window().getPosition());
        Thread.sleep(2000);


        // window'u maximize yapin
        driver.manage().window().maximize();


        // maximize yaptigimizda size ve konum yazdirin
        System.out.println("Maximize boyut: " + driver.manage().window().getSize());
        System.out.println("Mazimize konum: " + driver.manage().window().getPosition());
        Thread.sleep(2000);


        // window'u fullscreen yapin
        driver.manage().window().fullscreen();


        // fullscreen durumunda size ve konum yazdirin
        System.out.println("Fullscreen boyut: " + driver.manage().window().getSize());
        System.out.println("Fullscreen konum: " + driver.manage().window().getPosition());


        // istedigimiz konum ve boyuta getirin
        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(100,100));


        // istedigimiz boyutta iken size ve konum yazdirin
        System.out.println("Istedigimiz boyutta: " + driver.manage().window().getSize());
        System.out.println("Istedigimiz boyutta: " + driver.manage().window().getPosition());


        Thread.sleep(3000);
        driver.quit();
    }
}
