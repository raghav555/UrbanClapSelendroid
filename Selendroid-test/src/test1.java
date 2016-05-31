import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.client.SelendroidKeys;
import io.selendroid.common.SelendroidCapabilities;

public class test1 {



/**

* @param args

* @throws Exception 

*/

public static void main(String[] args) throws Exception {

// TODO Auto-generated method stub

//app-id:com.urbanclap.provider:3.0.3
SelendroidCapabilities capa = new SelendroidCapabilities("com.urbanclap.provider:3.0.3");



WebDriver driver = new SelendroidDriver(capa);

WebElement element2 = driver.findElement(By.xpath("//AppCompatButton[@value='Login']"));

element2.click();


Thread.sleep(50000);







//Assert.assertEquals("true", inputField.getAttribute("enabled"));

//inputField.sendKeys("Selendroid");

//Assert.assertEquals("Selendroid", inputField.getText());

Thread.sleep(8000);

driver.quit();



}
}