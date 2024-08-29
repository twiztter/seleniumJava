package pages;

public class PaginaCursos extends BasePage {
    
    private String fundamentosTestingLink = "//h3[normalize-space()='Fundamentos del Testing']";

    public PaginaCursos() {
        super(driver);
    }

    public void clickFundamentosTestingLink(){
        clickElement(fundamentosTestingLink);
    }

}

