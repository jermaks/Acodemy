import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import page_objects.DragAndDrop;

import java.time.Duration;

public class TestExample {

    private static final String TEST_URL = "https://crossbrowsertesting.github.io/drag-and-drop.html";
    private WebDriver driver;
    private DragAndDrop dragAndDrop;

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        dragAndDrop = new DragAndDrop();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testExample() {
            driver.get(TEST_URL);
            dragAndDrop.moveOneElementToAnother(driver);

    }
}




