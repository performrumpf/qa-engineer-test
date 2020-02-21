package com.statsperform.qa;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit5.SoftAssertsExtension;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.statsperform.utils.EventsPrinter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SoftAssertsExtension.class)
public abstract class AbstractQATest {

    @BeforeAll
    public static void browserSetup() {
        Configuration.browser = Browsers.CHROME;
        Configuration.startMaximized = true;
        Configuration.screenshots = false;
        Configuration.assertionMode = AssertionMode.SOFT;
    }

    @BeforeEach
    public void testSetup(TestInfo info) {
        SelenideLogger.addListener(info.toString(), new EventsPrinter());
    }

    @AfterEach
    public void testTearDown(TestInfo info) {
        SelenideLogger.removeListener(info.toString());
    }

}
