
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.FileInputStream;
import java.util.Properties;

public class TrustwaveCustomerSearch {

    public static void customerSearch(){

        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("E:\\Projects\\Tutorials\\LearningJava\\TrustwaveQaTest\\src\\globals.properties");
        prop.load(fis);

        System.setProperty(prop.getProperty("browserDriver"), prop.getProperty("driverLoc"));
        WebDriver driver=new ChromeDriver();

        driver.findElement(By.name("cust_name")).sendKeys(prop.getProperty("customerName"));

        driver.findElement(By.name("search_btn")).click();

        Assert.assertEquals(driver.findElement(By.name("cust_name")).getText(), prop.getProperty("customerName") );

    }
}
