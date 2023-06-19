package tests;

import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.ws.RequestWrapper;

public class Login extends TestBase{


    @BeforeMethod
    public void precondition(){
        if(app.getSessionHelper().isLogged()){
            app.getSessionHelper().logout();
        }
    }
    @Test

  public void positiveLoginTest(){

      app.getSessionHelper().openLoginForm();
      app.getSessionHelper().fillLoginForm(new User().withEmail("marzh.work@gmail.com").withPassword("Mno123FG$"));
      app.getSessionHelper().submitLogin();
      Assert.assertTrue(app.getSessionHelper().isElementPresent(By.cssSelector(".DweEFaF5owOe02.V_PnoJ2AynVwLp.G6CmOLx93OUZez")));

  }

    @Test

    public void negativeLoginTestWrongPassword(){
        app.getSessionHelper().openLoginForm();
        app.getSessionHelper().fillLoginForm(new User().withEmail("marzh.work@gmail.com").withPassword("Mno123FG"));
        app.getSessionHelper().submitLogin();
        Assert.assertTrue(app.getSessionHelper().isElementPresent(By.xpath("//span[@class='css-xal9c7']")));


  }
}
