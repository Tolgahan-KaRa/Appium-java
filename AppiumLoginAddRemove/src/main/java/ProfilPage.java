import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilPage extends BasePage{

    By userName = By.id("com.mobisoft.kitapyurdu:id/txt_username");
    By logOutButton = By.id("com.mobisoft.kitapyurdu:id/ln_logout");
    By logOutWidgetText = By.id("android:id/alertTitle");
    By logOutOkey = By.id("android:id/button1");
    By homePageIcon = By.id("com.mobisoft.kitapyurdu:id/navigation_home");

    public ProfilPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void goToHomePage() {

        waiting(userName,30);
        click(homePageIcon);

    }

    public void logOut() {

        waiting(userName , 30);
        scroll(0,-10);
        click(logOutButton);
        waiting(logOutWidgetText,30);
        click(logOutOkey);

    }
}
