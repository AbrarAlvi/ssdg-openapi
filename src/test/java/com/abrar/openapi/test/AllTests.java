package com.abrar.openapi.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.abrar.openapi.business.TodoBusinessImplStubTest;

@RunWith(Suite.class)
@SuiteClasses({ FirstMockitoTest.class,TodoBusinessImplStubTest.class })
public class AllTests {

}
