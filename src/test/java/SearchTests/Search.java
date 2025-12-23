package SearchTests;

import BaseTests.Base;
import static org.testng.Assert.*;
import Pages.SearchPage;
import Pages.SearchResultsPage;
import org.testng.annotations.Test;

public class Search extends Base {
    @Test
    public void verifySearchFunctionality() {
        searchPage.setInputAreaField("كيف تنضم إلى البنك");
        searchPage.selectSuggestion();
        SearchResultsPage searchResultsPage = searchPage.clickSearchIcon();
        assertTrue(searchResultsPage.getPageTitle().contains("كيف تنضم إلى البنك"));
    }
}
