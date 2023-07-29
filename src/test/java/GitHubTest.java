import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTest {
    @BeforeAll
    static void beforeAll() {
        BaseTest.beforeAll();
    }

    @Test
    void searchWikiTextTest() {
        open("https://github.com/");
        $(Selectors.byTagAndText("button", "Solutions")).click();
        $(".HeaderMenu--logged-out").$(byText("Enterprise")).click();
        $(".application-main").shouldHave(text("Build like the best"));
    }

    @AfterAll
    static void afterAll() {
        BaseTest.afterAll();
    }
}
