package tests;

import manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    static ApplicationManager app = new ApplicationManager();

    @BeforeClass

    public void setUp(){
        app.init();
    }


    @AfterClass

    public void stop(){
        app.tearDown();

    }
}
