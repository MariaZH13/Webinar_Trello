package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    SessionHelper sessionHelper;


    public void init(){
        wd = new ChromeDriver();
      //  wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        wd.navigate().to("https://trello.com/home");
        sessionHelper = new SessionHelper(wd);

    }


    public void tearDown(){
        wd.quit();
    }
    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
