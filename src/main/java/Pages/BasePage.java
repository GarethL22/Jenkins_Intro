package Pages;

import env.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract public class BasePage {

    protected static WebDriver driver = DriverUtil.getDefaultDriver();
    protected static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));;

}
