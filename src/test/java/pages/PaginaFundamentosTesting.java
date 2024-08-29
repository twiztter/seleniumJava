package pages;

public class PaginaFundamentosTesting extends BasePage {

    private String fundamentosTestingLink = "//h3[normalize-space()='Fundamentos del Testing']";

    public PaginaFundamentosTesting() {
        super(driver);
    }

    public void clickIntroduccionTestingLink(){
        clickElement(fundamentosTestingLink);
    }

}