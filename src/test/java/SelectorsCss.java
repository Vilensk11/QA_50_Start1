import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorsCss {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // driver.get("https://telranedu.web.app/home");
        driver.navigate().to("https://telranedu.web.app/home");
        pause(3);
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();
//        WebElement divRoot = driver.findElement(By.cssSelector("#root"));
//        System.out.println(divRoot.getAttribute("class"));
//        WebElement divRoot = driver.findElement(By.id("root"));
//        System.out.println(divRoot.getAttribute("class"));
        WebElement divRoot = driver.findElement(By.cssSelector("*[id='root']"));
        System.out.println(divRoot.getAttribute("class"));
        WebElement divRootClass = driver.findElement(By.cssSelector("div[class=container']"));
        System.out.println(divRootClass.getAttribute("id"));

        pause(3);
        driver.navigate().refresh();
        pause(3);
        driver.navigate().to("https://telranedu.web.app/login");
        pause(3);
        // driver.navigate().back();
        //driver.close();
        driver.quit();
    }

    @Test
    public void ilCarroTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");
        pause(3);
        WebElement logoHeader = driver.findElement(By.cssSelector("img[alt='logo']"));
        logoHeader.click();
        pause(3);
        //.navigation-link
        //a.navigation-link
        //a[class = 'navigation-link']
       // *[class = 'navigation-link']
        //WebElement bynSearch = driver.findElement(By.className("navigation-link"));
        WebElement bynSearch = driver.findElement(By.className("navigation-link"));
        bynSearch.click();
        pause(3);

        // a[id='1']
        // a#1.navigation-link
        // #1
        // [id='1']
        //WebElement btnLetCarWork = driver.findElement(By.cssSelector("#1"));
        //WebElement btnLetCarWork = driver.findElement(By.id("1"));
        WebElement btnLetCarWork = driver.findElement(By.partialLinkText("work"));
        btnLetCarWork.click();
        pause(3);

        // a[href*='/terms'] включает
        // a[href^='/of-use'] начинается с
        // a[href;='/use'] заканчивается
        // a.navigation-link[href='/terms-of-use']
        WebElement btnTermOfUse = driver.findElement(By.cssSelector("[href='/terms-of-use']"));
        btnTermOfUse.click();
        pause(5);

        WebElement btnSignUp = driver.findElement(By.cssSelector("div.header a.navigation-link:nth-child(5)"));
        btnSignUp.click();
        pause(5);

        WebElement btnLogin = driver.findElement(By.cssSelector("div.header a.navigation-link:last-child"));
        btnLogin.click();
        pause(5);

        driver.navigate().to("https://ilcarro.web.app/search");
        pause(5);
        driver.quit();

        


    }

    static void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
