import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TrustwaveCreateNewMerchant {

    public static void createNewMerchant(){

        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("E:\\Projects\\Tutorials\\LearningJava\\TrustwaveQaTest\\src\\globals.properties");
        prop.load(fis);

        System.setProperty(prop.getProperty("browserDriver"), prop.getProperty("driverLoc"));
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.findElement(By.name("new_cust_btn")).click();


        driver.findElement(By.name("cust_name")).sendKeys(prop.getProperty("customerName"));


        Select s= new Select(driver.findElement(By.name("state")));
        s.selectByValue(prop.getProperty("custState"));


        driver.findElement(By.name("postal_code")).sendKeys(prop.getProperty("zipCode"));


        driver.findElement(By.name("save_btn")).click();


    }
}
