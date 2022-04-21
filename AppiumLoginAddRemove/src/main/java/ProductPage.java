import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    By productListText = By.id("com.mobisoft.kitapyurdu:id/count");
    By selectAProduct = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView");
    By productDetail = By.id("com.mobisoft.kitapyurdu:id/back_button_center_text");
    By addAProduct = By.id("com.mobisoft.kitapyurdu:id/addToCart");
    By inYourCart = By.id("com.mobisoft.kitapyurdu:id/badge_text_view");

    public ProductPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void selectProduct() {

        waiting(productListText,30);
        click(selectAProduct);

    }

    public void addBasket() {

        waiting(productDetail,30);
        click(addAProduct);
        waiting(inYourCart, 30);

    }
}
