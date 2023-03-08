import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragDropTests {

    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement elementA = $("#column-a");
        SelenideElement elementB = $("#column-b");
        elementA.dragAndDropTo(elementB);
        elementA.shouldHave(exactText("B"));
        elementB.shouldHave(exactText("A"));
    }
}
