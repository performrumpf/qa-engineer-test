package com.statsperform.utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class QAUtils {

    public static void open_test_page() {
        open_page("http://10.219.227.113:8081/");
    }

    public static void open_bmi_calculator_page() {
        open_page("https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/metric_bmi_calculator/bmi_calculator.html");
    }

    public static void open_page(String url) {
        Selenide.open(url);
    }

    public static SelenideElement find_element_by_id(String id) {
        return Selenide.$(By.id(id));
    }

    public static SelenideElement find_element_by_name(String name) {
        return Selenide.$(By.name(name));
    }

    public static SelenideElement find_element_by_css(String css) {
        return Selenide.$(By.cssSelector(css));
    }

    public static SelenideElement find_element_by_xpath(String xpath) {
        return Selenide.$(By.xpath(xpath));
    }

}
