package org.addcustomercucu;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Nandhu\\Addcustomer\\src\\test\\resources\\Features",glue="org.addcustomercucu",plugin="html:target")

public class TestRunner {

}
