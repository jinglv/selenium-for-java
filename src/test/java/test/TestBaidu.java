package test;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author jingLv
 * @date 2020-06-08 6:16 下午
 */
public class TestBaidu {

    static WebDriver driver;

    @BeforeAll
    public static void before() {
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        driver.get("http://www.baidu.com/");
    }

    @AfterAll
    public static void after() {
        driver.quit();
    }
}
