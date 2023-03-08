import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class OpenEnterpriseTests {
    @Test
    void openEnterprise() {
        open("https://github.com");
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        $(byText("Build like the best")).shouldBe(Condition.visible);
    }
}