import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By profilIcon = By.id("com.mobisoft.kitapyurdu:id/btn_ic_header_account");
    By kitapYurduLogo = By.id("com.mobisoft.kitapyurdu:id/imageViewBigLogo");
    By searchIcon = By.id("com.mobisoft.kitapyurdu:id/navigation_search");

    public HomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickProfileIcon() {

        waiting(profilIcon, 50);
        click(profilIcon);

    }

    public void goToSearchPage() {

        waiting(kitapYurduLogo, 30);
        click(searchIcon);

    }

    public void goToProfilPage() {

        waiting(profilIcon,30);
        click(profilIcon);

    }
}
