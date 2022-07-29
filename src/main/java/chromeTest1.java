import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class chromeTest1 {

@Test
    public void chromeTest() throws MalformedURLException {

        URL u=new URL("http://localhost:4444/wd/hub");

       DesiredCapabilities cap=DesiredCapabilities.chrome();

        RemoteWebDriver driver=new RemoteWebDriver(u,cap);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());



    }
}
