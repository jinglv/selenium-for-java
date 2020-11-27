package test;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author jingLv
 * @date 2020-06-08 6:16 下午
 */
public class TestBaidu {

    static WebDriver driver;

    @BeforeAll
    static void before() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress","127.0.0.1:9222");
        driver = new ChromeDriver(options);
    }

    @Test
    public void test() {
        driver.findElement(new By.ByCssSelector(".frame_nav_item_title")).click();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.alert(\"弹窗\")");
        javascriptExecutor.executeScript("a=document.getElementById(\"kw\").value;window.alert(a)");
        // 返回
        javascriptExecutor.executeScript("return document.getElementById('kw').value");
    }

    @AfterAll
    static void after() {
    }
}
