package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserServiceSteps extends ScenarioSteps {

    @Step
    public void createUser() {
        System.out.println("User created");
    }

    @Step
    public void updateUser() {
        System.out.println("User updated");
    }

    @Step
    public void deleteUser() {
        System.out.println("User deleted");
    }

    @Step
    public void createTag() {
        System.out.println("Tag created");
    }

    @Step
    public void updateTag() {
        System.out.println("Tag updated");
    }

    @Step
    public void deleteTag() {
        System.out.println("Tag deleted");
    }
}
