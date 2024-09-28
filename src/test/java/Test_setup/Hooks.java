package Test_setup;

import Base_Setup.Driver_Initializer;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver _driver;
    @Before
    public void SetupDriver()
    {
        System.out.println("The Before.....");
//        Driver_Initializer instanceSetup=Driver_Initializer.getInstance();
//        _driver=instanceSetup.OpenTheDriver("www.google.com");
    }
}
