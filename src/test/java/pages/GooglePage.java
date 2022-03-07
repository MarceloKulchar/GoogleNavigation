package pages;



public class GooglePage extends BasePage{


    private String searchButtom = "/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button";
    private String SearchTextField = "/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input";
    
    public GooglePage() {
        super(driver);
        
    }
    
    public void navigateToGoogle() {
        navigateTo("https://www.youtube.com/");
    }

    public void clicGoogleSearch(){
        clicElement(searchButtom);
    }

    public void enterSearchCriteria(String criteria){
        write(SearchTextField, criteria);
    }
    
}
