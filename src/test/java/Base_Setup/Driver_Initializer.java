package Base_Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver_Initializer {
    private static  Driver_Initializer _initializer=null;
    private WebDriver _driver;
    private Driver_Initializer()
    {

    }
    public WebDriver OpenTheDriver(String url)
    {
        _driver=new EdgeDriver();
        _driver.get(url);
        return _driver;
    }
    public static Driver_Initializer getInstance()
    {
        if(_initializer==null)
            _initializer=new Driver_Initializer();
        return _initializer;
    }

}
