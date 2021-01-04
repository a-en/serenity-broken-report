package com.companyname.service1.users;

import com.companyname.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class UpdateUserTests extends BaseTest {

    @Test
    public void checkUserIsUpdatedSuccessfully() {
        userServiceSteps.createUser();
    }
}
