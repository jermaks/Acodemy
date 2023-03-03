import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import page_objects.DragAndDrop;

import driver_manager.DriverManager;

public class TestExample {

    private final String TEST_URL = "https://crossbrowsertesting.github.io/drag-and-drop.html";
    private WebDriver driver;
    private DragAndDrop dragAndDrop;

    @BeforeSuite
    public void setUp() {
        driver = DriverManager.get();
        dragAndDrop = new DragAndDrop();
    }

    @AfterSuite
    public void tearDown() {
        DriverManager.quit();
    }

    @Test
    public void testExample() {
        driver.get(TEST_URL);
        dragAndDrop.moveOneElementToAnother(driver);

        String expectedTitle = "Dropped!";
        String originalTitle = driver.findElement(By.id("droppable")).getText();
        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");

    }
}







