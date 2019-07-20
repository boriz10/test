package common;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class CustomChromeDriver implements DriverSource {

    private static final Logger LOG = LoggerFactory.getLogger(CustomChromeDriver.class.getSimpleName());

    @Override
    public WebDriver newDriver() {
        ChromeOptions options = new ChromeOptions();
        OsCheck.OSType ostype = OsCheck.getOperatingSystemType();
        switch (ostype) {
            case Windows:
                options.addExtensions(new File("drivers\\windows\\extension\\chrome\\ModHeader_2.1.1_0.crx"));
                break;
            case MacOS:
                options.addExtensions(new File("drivers/windows/extension/chrome/ModHeader_2.1.1_0.crx"));
                break;
            case Other:
                LOG.error("Can't define OS");
                break;
        }
        options.addArguments("--start-maximized");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-print-preview");
        options.addArguments("--test-type");
        options.addArguments("--disable-web-security");
        options.addArguments("--disk-cache-size=1");
        options.addArguments("--media-cache-size=1");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(capabilities);
        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
