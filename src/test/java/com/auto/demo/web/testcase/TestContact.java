package com.auto.demo.web.testcase;

import com.auto.demo.web.page.ContactPage;
import com.auto.demo.web.page.MainPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author jingLv
 * @date 2020/11/30
 */
public class TestContact {

    private static ContactPage contactPage;

    @BeforeAll
    static void start() {
        MainPage mainPage = new MainPage();
        contactPage = mainPage.toContact();
    }

    @Test
    void testAddMember() {
        String username = "xiaohei";
        contactPage.addMember(username, "0016", "13612343245").search(username);
        Assertions.assertEquals(contactPage.getUserName(), username);
    }

    @Test
    void testSearchAndDelete() {
        contactPage.search("xiaohei").delete();
    }

    @Test
    void testImportFromFile() {
        contactPage.importFromFile(this.getClass().getResource("/通讯录批量导入模板.xlsx"));
    }

    @AfterAll
    static void close() {
        contactPage.close();
    }
}
