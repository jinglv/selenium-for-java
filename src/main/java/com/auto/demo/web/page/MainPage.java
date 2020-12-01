package com.auto.demo.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

/**
 * 首页页面
 *
 * @author jingLv
 * @date 2020/11/30
 */
public class MainPage extends BasePage {

    public MainPage() {
        super();
        String url = "https://work.weixin.qq.com/wework_admin/frame";
        driver.get(url);

        driver.manage().addCookie(new Cookie("pgv_pvid", "965326920"));
        driver.manage().addCookie(new Cookie("wwrtx.c_gdpr", "0"));
        driver.manage().addCookie(new Cookie("pac_uid", "0_aee823a5acb34"));
        driver.manage().addCookie(new Cookie("wwrtx.i18n_lan", "zh"));
        driver.manage().addCookie(new Cookie("_ga", "GA1.2.486968943.1606468059"));
        driver.manage().addCookie(new Cookie("wwrtx.ref", "direct"));
        driver.manage().addCookie(new Cookie("wwrtx.refid", "4250759204197565"));
        driver.manage().addCookie(new Cookie("wwrtx.ltype", "1"));
        driver.manage().addCookie(new Cookie("wxpay.corpid", "1970324947149288"));
        driver.manage().addCookie(new Cookie("wxpay.vid", "1688850129600022"));
        driver.manage().addCookie(new Cookie("wwrtx.vid", "1688850129600022"));
        driver.manage().addCookie(new Cookie("Hm_lvt_9364e629af24cb52acc78b43e8c9f77d", "1606468059,1606468075,1606469576,1606714819"));
        driver.manage().addCookie(new Cookie("Hm_lpvt_9364e629af24cb52acc78b43e8c9f77d", "1606714819"));
        driver.manage().addCookie(new Cookie("_gid", "GA1.2.1004022239.1606714820"));
        driver.manage().addCookie(new Cookie("ww_rtkey", "827v2hg"));
        driver.manage().addCookie(new Cookie("wwrtx.vst", "qJPbKO1dHUx-HK-uZyQn3Gzb4ZRknZRtVMO15BcnbmPZ65DqP5TOGXWUSurINmluzUqXYGu6qC9GLK0BCMqr3d8wvK-XqInI5BIQ9dXWI19PQ1TBjN5gY3wnelm2dbw9eB-2tge0v9zLOv9LoY42AXbutMbCKKS6NSEkqTZfEpLLmitXC6nsjWYP_IkUUa_7awwqF1esFgD9iCnl6hvmU01_-3pFpx9rJfSI37bNOtWvKDfQSwP0p8RKSRVti6JmAG4l_yp-GYZ0ccY4hujYyA"));
        driver.manage().addCookie(new Cookie("wwrtx.d2st", "a7935275"));
        driver.manage().addCookie(new Cookie("wwrtx.sid", "6QnZz9M3D9-XwaqXVRhlpr3lQtDLs6DnlOtxHcFDa5AfE34chprPRek9vQkVoMXn"));
        driver.manage().addCookie(new Cookie("_gat", "1"));

        driver.get(url);
    }

    /**
     * 调用通讯录页面
     *
     * @return
     */
    public ContactPage toContact() {
        // 进入通讯录页面
        click(By.cssSelector("#menu_contacts"));
        return new ContactPage(driver);
    }

}
