import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    AppiumDriver<MobileElement> driver;

    public BasePage(AppiumDriver<MobileElement> driver){

        this.driver = driver;

    }

    public MobileElement find(By locator){

        return (MobileElement) driver.findElement(locator);

    }

    public void click(By locator){

        find(locator).click();

    }

    public void type(By locator, String text){

        find(locator).sendKeys(text);

    }

    public void androidEnterButton() {

        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));


    }



    public void  scroll(Integer x, Integer y){

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy("+ x +","+ y +")");

    }

    public void waiting(By locator, Integer x){

        WebDriverWait wait = new WebDriverWait(driver, x);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}
