package com.dci.java.test.correct;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses( {TestEmpListSize.class, TestEmpShuffle.class} )
public class AllTests {

}
