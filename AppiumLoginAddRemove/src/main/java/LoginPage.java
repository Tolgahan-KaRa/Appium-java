import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By memberLogin = By.id("com.mobisoft.kitapyurdu:id/back_button_center_text");
    By userInputText = By.id("com.mobisoft.kitapyurdu:id/textview_mail");
    By userInputPass = By.id("com.mobisoft.kitapyurdu:id/textview_password");
    By loginButton = By.id("com.mobisoft.kitapyurdu:id/loginButton");

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    public void inputLogIn() {

        waiting(memberLogin,30);
        type(userInputText,"tolga-han-kara@hotmail.com");
        type(userInputPass, "********");

        click(loginButton);



    }
}
