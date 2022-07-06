package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDisplayPage {

    @FindBy(xpath = "//span[@class='category-name']")
    public static WebElement PageName;

    public static String getCurrentProductPage() {
        return PageName.getText().trim();
    }
}
