package StepDefinition;

import Pages.HomePage;
import Pages.ProductDisplayPage;
import env.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseSteps {

    private static WebDriver driver;

    public BaseSteps() {
        driver = DriverUtil.getDefaultDriver();
        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, ProductDisplayPage.class);
    }
}
