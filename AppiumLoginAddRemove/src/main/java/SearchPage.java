import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{

    By kitapYurduLogo = By.id("");
    By searchText = By.id("com.mobisoft.kitapyurdu:id/small_logo_center_text");
    By searchArea = By.id("com.mobisoft.kitapyurdu:id/search");
    By searchBook = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.TextView");
    By productListText = By.id("");



    public SearchPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    public void search() {

        waiting(searchText,30);
        click(searchBook);
//        type(searchArea,"Ustalık");
//        ((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.ENTER);

    }
}
