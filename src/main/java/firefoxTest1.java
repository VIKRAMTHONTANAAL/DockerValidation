import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class firefoxTest1 {


    @Test
    public void firefoxTest() throws MalformedURLException {

        URL u=new URL("http://localhost:4444/wd/hub");

       DesiredCapabilities cap=DesiredCapabilities.firefox();

        RemoteWebDriver driver=new RemoteWebDriver(u,cap);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());



    }
}
