package com.auto.demo.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * PO基类
 *
 * @author jingLv
 * @date 2020/12/01
 */
public class BasePage {

    RemoteWebDriver driver;
    WebDriverWait webDriverWait;

    public BasePage() {
        driver = new ChromeDriver();
        // 隐式等待
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(driver, 10);
    }

    public BasePage(RemoteWebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 10);
    }

    /**
     * 点击操作
     *
     * @param by
     */
    public void click(By by) {
        // TODO:异常处理
        // 显示等待，等待元素可点击
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    /**
     * 输入操作
     *
     * @param by
     * @param content
     */
    public void sendKeys(By by, String content) {
        // 显示等待，等待元素可见
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).sendKeys(content);
    }

    /**
     * 文件上传
     *
     * @param by
     * @param path
     */
    public void upload(By by, String path) {
        // 显示等待，等待元素存在
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).sendKeys(path);
    }

    public void close() {
        driver.quit();
        driver = null;
    }
}
