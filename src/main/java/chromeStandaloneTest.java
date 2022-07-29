import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class chromeStandaloneTest {


    public static void main(String []args) throws MalformedURLException {

        URL u=new URL("http://localhost:4444/wd/hub");

       DesiredCapabilities cap=DesiredCapabilities.edge();

        RemoteWebDriver driver=new RemoteWebDriver(u,cap);
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());



    }
}
