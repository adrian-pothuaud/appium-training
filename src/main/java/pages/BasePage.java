package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class BasePage {

    private WebDriver driver;
    private WebElement fieldA;
    private WebElement fieldB;
    private WebElement btn_Plus;
    private WebElement btn_Minus;
    private WebElement btn_Multiply;
    private WebElement btn_Divide;
    private WebElement result;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    public String GetResult() {

        this.result = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/resultTextView"));

        return this.result.getText().substring(14, 15);
    }

    public void Addition(String a, String b) {

        this.fieldA = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldLeft"));
        this.fieldB = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldRight"));
        this.btn_Plus = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/additionButton"));

        this.fieldA.clear();
        this.fieldA.sendKeys(a);
        this.fieldB.clear();
        this.fieldB.sendKeys(b);
        this.btn_Plus.click();
    }

    public void Substraction(String a, String b) {

        this.fieldA = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldLeft"));
        this.fieldB = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldRight"));
        this.btn_Minus = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/subtractButton"));

        this.fieldA.clear();
        this.fieldA.sendKeys(a);
        this.fieldB.clear();
        this.fieldB.sendKeys(b);
        this.btn_Minus.click();
    }

    public void Multiplication(String a, String b) {

        this.fieldA = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldLeft"));
        this.fieldB = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldRight"));
        this.btn_Multiply = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/multiplicationButton"));

        this.fieldA.clear();
        this.fieldA.sendKeys(a);
        this.fieldB.clear();
        this.fieldB.sendKeys(b);
        this.btn_Multiply.click();
    }

    public void Division(String a, String b) {

        this.fieldA = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldLeft"));
        this.fieldB = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldRight"));
        this.btn_Divide = this.driver.findElement(By.id("com.vbanthia.androidsampleapp:id/divisionButton"));

        this.fieldA.clear();
        this.fieldA.sendKeys(a);
        this.fieldB.clear();
        this.fieldB.sendKeys(b);
        this.btn_Divide.click();
    }
}
