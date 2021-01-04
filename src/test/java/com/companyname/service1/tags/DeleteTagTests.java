package com.companyname.service1.tags;

import com.companyname.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class DeleteTagTests extends BaseTest {

    @Test
    public void checkTagIsDeletedSuccessfully() {
        userServiceSteps.deleteTag();
    }

}
