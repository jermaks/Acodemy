import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestExample {
    @Test
    public void testExample() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
            Thread.sleep(2000);

            WebElement element = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));

            Actions actions =
                    new Actions(driver);


            actions
                    .moveToElement(element)
                    .clickAndHold()
                    .moveToElement(element2)
                    .release()
                    .build()
                    .perform();

        } catch (InterruptedException e) {

            e.printStackTrace();
        } finally {

            Thread.sleep(6000);

            driver.quit();

        }
    }
}


