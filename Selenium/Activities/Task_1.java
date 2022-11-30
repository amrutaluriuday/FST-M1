import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task_1 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();


        //And now use this to visit the website
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.close();

    }
}