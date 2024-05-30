package com.qa.opencart.tests;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.Constatnts;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.qa.opencart.utils.Constatnts.LOGIN_PAGE_TITLE;

public class LoginPageTest extends BaseTest {

    @Test
    public void loginPageTest(){
       String actualTitle = loginPage.getPageTitle();
        Assert.assertEquals(actualTitle, LOGIN_PAGE_TITLE);
    }

    @Test
    public void loginPageUrlTest(){
        String url = loginPage.getLoginPageUrl();
        Assert.assertTrue(url.contains(Constatnts.LOGIN_PAGE_FRACTION_URL));
    }

    @Test
    public void forgotPwdLink(){
       Assert.assertTrue(loginPage.isFgtPswdLinkExist());
    }

    @Test
    public void doLogin(){
        loginPage.doLogin("", "");
    }
}
