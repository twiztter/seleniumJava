package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan']";

    public PaginaPrincipal() {
        super(driver);
    }

    // Metodo para navegar a freerangetesters.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com/");
    }

    public void clickOnSectionNavigationBar(String section){
        //Reemplaza el marcador de posicion en section link con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOnElegirPlanButton(){
        clickElement(elegirUnPlanButton);
    }

}
