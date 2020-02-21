package com.statsperform.qa.test;

import static com.statsperform.utils.QAUtils.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;
import com.statsperform.qa.AbstractQATest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class QATest1 extends AbstractQATest {

    // Not familiar with JUnit 5 parameterized tests? see https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests
    @ParameterizedTest
    @CsvSource({
            "180, 80, 'normal', '24.7', '59.9', '80.7'",
            "185, 60, 'underweight', '17.5', '63.3', '85.2'",
            "180, 90, 'overweight', '27.8', '59.9', '80.7'",
            "180, 100, 'obese', '30.9', '59.9', '80.7'",
            "180, 60, 'normal', '18.5', '59.9', '80.7'"
    })
    public void bmiTest(int height, int weight, String type, String bmi, String minKilograms, String maxKilograms) {
        // Opens test page
        // https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/metric_bmi_calculator/bmi_calculator.html
        open_bmi_calculator_page();

        /*
            TODO: assign elements with selectors. You can use QAUtils methods to find elements:
            * find_element_by_id(string)
            * find_element_by_name(string)
            * find_element_by_css(string)
            * find_element_by_xpath(string)
         */

        SelenideElement heightInput = null;
        SelenideElement weightInput = null;
        SelenideElement calculateButton = null;
        SelenideElement bmiNum = null;
        SelenideElement bmiType = null;
        SelenideElement minKg = null;
        SelenideElement maxKg = null;
        SelenideElement highlightedBmiType = null;

        /*
            TODO: Finish test steps. Use test parameters (see content of CsvSource)
            1. Enter height (in cm)
            2. Enter weight (in kg)
            3. Press Calculate button
         */

        // Do NOT change any code after that
        bmiNum.should(visible, exactText(bmi));
        minKg.should(visible, exactText(minKilograms));
        maxKg.should(visible, exactText(maxKilograms));
        bmiType.should(visible, exactText(type));
        highlightedBmiType.shouldHave(exactText(type));
    }
}
