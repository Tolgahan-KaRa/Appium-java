import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.junit.jupiter.api.TestMethodOrder;

import java.net.URL;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class BeseTest {

    AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setUp(){

        try{

            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0.0");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME,"karawi RNE-L01");
            caps.setCapability(MobileCapabilityType.UDID,"2VN5T18423010456");
            caps.setCapability("appPackage","com.mobisoft.kitapyurdu");
            caps.setCapability("appActivity","com.mobisoft.kitapyurdu.main.SplashActivity");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new AppiumDriver<MobileElement>(url, caps);
        }catch (Exception e){

            System.out.println("Cause is : "+ e.getCause());
            System.out.println("Mesage is : "+ e.getMessage());
            e.printStackTrace();

        }

    }

}
