import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RSATest {
    @Test
    public void HomePageCheck() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444"), caps );
        driver.get("http://rahulshettyacademy");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
