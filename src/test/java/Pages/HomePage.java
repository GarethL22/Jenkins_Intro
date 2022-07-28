package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public void GoToHomePage() {
        System.out.println("Navigating to homepage");
        driver.get("http://automationpractice.com/index.php");
    }

    public void SelectNavBarCategory(String category) {
        System.out.println("Selecting the " + category + " category");
        WebElement navBarCategoryElement = driver.findElement(By.xpath("//ul[contains(@class,'menu-content')]/li/a[@title='" + category + "']"));
        wait.until(ExpectedConditions.elementToBeClickable(navBarCategoryElement));
        navBarCategoryElement.click();
    }
}
