package api_automation.dataProviderClass;

import org.testng.annotations.DataProvider;

public class GorestDataProviderClass {
    @DataProvider(name = "dataProvider")
    public Object[][] method() {
        return new Object[][]  {
                {"John@gmail.com", "John", "female", "Active"},
                  };

    }

    public Object[][] dpMethod() {
        return new Object[][]{};
    }
}
