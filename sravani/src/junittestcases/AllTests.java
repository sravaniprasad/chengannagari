package junittestcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testcasediv.class, testcasemul.class, testcasesub.class })
public class AllTests {

}
