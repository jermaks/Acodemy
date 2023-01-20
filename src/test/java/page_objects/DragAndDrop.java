package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDrop {

    public static WebElement draggableElement(WebDriver driver) {
        return driver.findElement(By.id("draggable"));
    }

    public static WebElement droppableElement(WebDriver driver) {
        return driver.findElement(By.id("droppable"));
    }

}
