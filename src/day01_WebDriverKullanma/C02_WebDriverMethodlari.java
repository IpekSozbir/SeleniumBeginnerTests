package day01_WebDriverKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_WebDriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");
        // istenen url'e gider
        // url yazarken www yazmasak da webDriver objesi url'e gider
        // ancak https: yazmazsak kod calismaz

        System.out.println(driver.getTitle()); // YouTube
        System.out.println(driver.getCurrentUrl()); // https://www.youtube.com/

        System.out.println("---------------------------------------");

        // System.out.println(driver.getPageSource()); // sayfa kaynak kodlarini getirir

        System.out.println("---------------------------------------");

        System.out.println(driver.getWindowHandle()); // D3A09B9EC445F8320C76C1FCD392859C
        System.out.println(driver.getWindowHandles()); // [D3A09B9EC445F8320C76C1FCD392859C]

        // WebDriver olusturulan her bir objeye
        // benzersiz (unique) bir Window Handle Degeri atar
        // eger bir class calistiginda birden fazla windows acilirsa
        // her birinin ayri bir Window Handle Degeri olur
        // getWindowHandle() driver'in actigi son window'un Window Handle Degerini verir
        // getWindowHandles() ise acilan tum windowlarin Window Handle Degerlerini
        // bir set olarak verir

        // driver'in acilan windowslar arasinda gecis yapabilmesi icin
        // gececegi window'un Window Handle Degerini bilmesi gerekir


        Thread.sleep(3000);

        driver.quit(); // actigimiz driver'i kapatir
        //driver.close(); // actigimiz driver'i kapatir
        // aralarindaki fark close() sadece 1 window kapatir
        // quit() ise test sirasinda birden fazla windows acilsa da hepsini kapatir

    }
}
