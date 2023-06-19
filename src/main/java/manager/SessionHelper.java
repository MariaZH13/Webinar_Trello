package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{
     public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
         pause(3000);
         click(By.xpath("//a[contains(@class,'Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr')]"));
    }

    public void fillLoginForm(User user) {
         type(By.id("user"), user.getEmail());
         click(By.xpath("//input[@value='Continue']"));
         pause(3000);
         type(By.id("password"), user.getPassword());

    }

    public void submitLogin() {
         click(By.cssSelector("[type='submit']"));
         pause(3000);

    }

    public void logout(){
         click(By.cssSelector(".DweEFaF5owOe02.V_PnoJ2AynVwLp.G6CmOLx93OUZez"));
         click(By.xpath("//span[.='Log out']"));
         click(By.xpath("//span[contains(text(),'Log out')]"));
    }

    public boolean isLogged(){
         return isElementPresent(By.xpath("//span[.='Log out']"));
    }
}
