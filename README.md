# QA Engineer Test

1. Clone repository: `https://github.com/performrumpf/qa-engineer-test.git` (GitHub Desktop recommended)
2. Import project to an IDE of your choice (Eclipse, IntelliJ etc.)
3. Create a new branch with your family name or github username
4. Finish test methods within test source folder `src/test/java` (Check TODOs)
5. Commit and push your solution to your personal branch

This repository contains unfinished test methods to test your usage with JUnit 5 and Selenide

## Test 1

Test Class: `com.statsperform.qa.test.QATest1`  
Test method: `bmiTest`  
Test page: https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/metric_bmi_calculator/bmi_calculator.html

Given is a `@ParameterizedTest` with 2 input parameters (height, weight)
and 4 output parameters (type, bmi, minKilogram, maxKilogram) for a BMI calculator.
`@CsvSource` contains 5 different test datas with inputs and outputs which will be
injected into `bmiTest` test method.

**Use case**

1. Enter `height` in centimeters
2. Enter `weight` in kilograms
3. Press *Calculate* button
4. Evaluate within the text:
   * BMI value
   * Weight type (underweight, overweight etc.)
   * minimum kilogram
   * maximum kilogram
5. Evaluate highlighted table row on the right side

At the moment the test will throw `NullPointerException`. Your task is to give every `SelenideElement`
a selector and call the correct methods to interact with the page so that all
5 assertions are true.

## Tips

* Class `com.statsperform.utils.QAUtils` contains some useful methods to find elements.  
it is up to you what you will use (see table below)
* In the logs you can see test steps incl. their states *PASS* or *FAIL*
* Use Web Developer Tools or plugins (i.e. )
* If you want to use a different browser, just change configuration in class `com.statsperform.qa.AbstractQATest`
* **Don't trust web developer's page designs.**

QAUtils | Selenide
------- | --------
`find_element_by_id("username")` | `$(By.id("username"))`
`find_element_by_name"username")` | `$(By.name("username"))`
`find_element_by_css("input#username")` | `$(By.cssSelector("input#username"))`<br />`$("input#username")`
`find_element_by_xpath("//input(@id='username'")` | `$(By.xpath("//input(@id='username'"))`<br />`$x("//input(@id='username'")`
