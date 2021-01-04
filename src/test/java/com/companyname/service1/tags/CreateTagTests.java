package com.companyname.service1.tags;

import com.companyname.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CreateTagTests extends BaseTest {

    @Test
    public void checkTagIsCreatedSuccessfully() {
        userServiceSteps.createTag();
    }
}
