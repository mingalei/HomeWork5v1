import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTest
{
    @BeforeAll
    static void beforeAll()
    {

        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy="eager";

    }
    @Test
    void searchWikiTextTest()
    {
        open("https://github.com/");
        $(Selectors.byTagAndText("button", "Solutions" )).click();
        $(".HeaderMenu--logged-out").$(byText("Enterprise")).click();
        $(".application-main").shouldHave(text("Build like the best"));
    }
}
