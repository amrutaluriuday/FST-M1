import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.html.HTMLInputElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class Assignment {

    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("http://alchemy.hguy.co/orangehrm");

        //Check the title of the page
        String pageTitle = driver.getTitle();
        //Print the title of the page
        System.out.println(pageTitle);

        //Find the input fields and enter text
        WebElement username = driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
        WebElement password = driver.findElement(By.xpath("//input[@id=\"txtPassword\"]"));
        username.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("deviS");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("tat1");
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).sendKeys("deviS");
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpLastName\"]")).sendKeys("tat1");
        driver.findElement(By.xpath("//*[@id=\"personal_optGender_1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"personal_txtLicExpDate\"]")).sendKeys("2022-11-02");
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[9]/a/b")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"addWorkExperience\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"experience_employer\"]")).sendKeys("IBM");
        driver.findElement(By.xpath("//*[@id=\"experience_jobtitle\"]")).sendKeys("Test Specilist Automation");
        driver.findElement(By.xpath("//*[@id=\"btnWorkExpSave\"]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[8]/a/b")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[4]/div/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"applyleave_txtLeaveType\"]"));

        driver.findElement(By.xpath("//*[@id=\"applyleave_txtFromDate\"]")).sendKeys("2022-11-02");
        driver.findElement(By.xpath("//*[@id=\"applyleave_txtToDate\"]")).sendKeys("2022-11-02");




















        driver.close();


    }

}
