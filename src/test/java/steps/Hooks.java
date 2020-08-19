package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseUtil {
    private BaseUtil baseUtil;
    public Hooks(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }


    @Before
    public void Initialize(){
        System.out.println("Opening the browser :Chrome");
   System.setProperty("webdriver.chrome.driver","C:\\Users\\sindhu.diddi\\Downloads\\chromedriver\\chromedriver.exe");
   baseUtil.driver = new ChromeDriver();
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed())
        {
            //TakeScreenshot
        }

    }
}
