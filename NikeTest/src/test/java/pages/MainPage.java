package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private static final String HOMEPAGE_URL = "https://www.nike.com/";
    private final WebDriver driver;

    @FindBy(xpath = "//button[@class='ncss-btn-primary-dark pt3-sm pb3-sm pt2-lg pb2-lg ta-sm-c u-full-width']")
    private WebElement accessCookieButton;

    @FindBy(xpath = "//button[@class='pre-search-btn ripple']")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@data-el-type='Hero']")
    private WebElement cardButton;

    @FindBy(xpath = "//*[@aria-label='Filter for Red']")
    private WebElement redFilterButton;

    @FindBy(xpath = "//*[@aria-label='Filter for Men']")
    private WebElement menFilterButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void enterSearchText(String searchText) {
        searchInput.sendKeys(searchText);
    }

    public void enterFirstCard() {
        cardButton.click();
    }
    public void searchClick() {
        searchButton.click();
    }
    public void accessCookieClick() {
        accessCookieButton.click();
    }
    public void setMenFilter() {
        menFilterButton.click();

    }
    public void setRedFilter() {
        redFilterButton.click();
    }

}

