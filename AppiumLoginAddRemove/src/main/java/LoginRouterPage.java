import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginRouterPage extends BasePage{

    By logInButton = By.id("com.mobisoft.kitapyurdu:id/btn_login");
    By myAccount = By.id("com.mobisoft.kitapyurdu:id/back_button_center_text");

    public LoginRouterPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickLogInButton() {

        waiting(myAccount,30);
        click(logInButton);

    }
}
