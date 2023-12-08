import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test {

    public class TestOrder {

        @org.junit.jupiter.api.Test
        void orderTest() {
            open("http://localhost:9999/");
            $("[data-test-id=\"name\"] input").sendKeys("Лапенко Антон");
            $("[data-test-id=\"phone\"] input").sendKeys("+79998887766");
            $("[data-test-id=\"agreement\"] span").click();
            $(By.className("button")).click();
            $("[data-test-id=\"order-success\"]").shouldHave(Condition.text("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
        }
    }
}
