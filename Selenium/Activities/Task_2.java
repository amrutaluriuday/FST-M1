import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task_2 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/img")).click();
        driver.close();

    }
}
