import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

import page_objects.DragAndDrop;


public class TestExample {
    private static final String TEST_URL = "https://crossbrowsertesting.github.io/drag-and-drop.html";
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testExample() {

            driver.get(TEST_URL);

            DragAndDrop.draggableElement(driver);
            DragAndDrop.droppableElement(driver);

            Actions actions =
                    new Actions(driver);

            actions
                .moveToElement(DragAndDrop.draggableElement(driver))
                .clickAndHold()
                .moveToElement(DragAndDrop.droppableElement(driver))
                .release()
                .build()
                .perform();
    }
}




