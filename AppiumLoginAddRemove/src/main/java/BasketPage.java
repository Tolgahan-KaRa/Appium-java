import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {

    By basketIcon = By.id("com.mobisoft.kitapyurdu:id/navigation_cart");
    By myBasket = By.id("com.mobisoft.kitapyurdu:id/text_button_center_text");
    By threePointsButton = By.id("com.mobisoft.kitapyurdu:id/overflowImageButton");
    By deleteButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
    By emptyBasket = By.id("com.mobisoft.kitapyurdu:id/messageText");
    By homeIcon = By.id("com.mobisoft.kitapyurdu:id/navigation_home");

    public BasketPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void deleteProduct() {

        click(basketIcon);
        waiting(myBasket,30);
        click(threePointsButton);
        waiting(deleteButton,30);
        click(deleteButton);
        waiting(emptyBasket,30);


    }

    public void goToHome() {

        click(homeIcon);

    }
}
