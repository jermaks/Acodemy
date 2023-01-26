package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    private final By DRAGGABLE_ELEMENT = By.id("draggable");
    private final By DROPPABLE_ELEMENT = By.id("droppable");

    public void moveOneElementToAnother(WebDriver driver) {
        Actions actions =
                new Actions(driver);

        actions
                .moveToElement(driver.findElement(DRAGGABLE_ELEMENT))
                .clickAndHold()
                .moveToElement(driver.findElement(DROPPABLE_ELEMENT))
                .release()
                .build()
                .perform();

    }
}

