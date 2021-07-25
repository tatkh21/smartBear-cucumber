package com.smartBear.step_definitions;

import com.smartBear.utilities.BrowserUtils;
import com.smartBear.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void tearDownScenario() {
        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }
}
