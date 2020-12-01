package com.auto.demo.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

/**
 * "通讯录"PO页面
 *
 * @author jingLv
 * @date 2020/11/30
 */
public class ContactPage extends BasePage {


    public ContactPage(RemoteWebDriver driver) {
        super(driver);
    }

    /**
     * 新增通讯录成员
     *
     * @param username
     * @param acctId
     * @param mobile
     * @return
     */
    public ContactPage addMember(String username, String acctId, String mobile) {
        By addMember = By.linkText("添加成员");

        // 增加循环进行点击，保证稳定性，只要控件存在则一直点击(死循环)，点击成功为止
        while (driver.findElements(addMember).size() > 0) {
            click(addMember);
        }
        sendKeys(By.name("username"), username);
        sendKeys(By.name("acctid"), acctId);
        sendKeys(By.name("mobile"), mobile);
        click(By.cssSelector(".js_btn_save"));

        return this;
    }

    /**
     * 查找通讯录成员
     *
     * @param keywords
     * @return
     */
    public ContactPage search(String keywords) {
        sendKeys(By.id("memberSearchInput"), keywords);
        return this;
    }

    /**
     * 获取页面信息，进行断言
     *
     * @return
     */
    public String getUserName() {
        return driver.findElement(By.cssSelector(".member_display_cover_detail_name")).getText();
    }

    /**
     * 删除通讯录成员
     *
     * @return
     */
    public ContactPage delete() {
        click(By.linkText("删除"));
        click(By.linkText("确认"));
        return this;
    }

    /**
     * 文件导入
     *
     * @param path
     * @return
     */
    public ContactPage importFromFile(URL path) {
        // 导入地址处理
        String pathUtf = "";

        try {
            pathUtf = URLDecoder.decode(path.getFile(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        click(By.cssSelector(".ww_operationBar:nth-child(1) .ww_btn_PartDropdown_left"));
        click(By.linkText("文件导入"));
        upload(By.cssSelector(".ww_fileImporter_fileContainer_uploadInputMask"), pathUtf);
        click(By.linkText("导入"));
        click(By.linkText("完成"));
        return this;
    }
}
