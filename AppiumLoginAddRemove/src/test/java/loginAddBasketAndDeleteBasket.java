import org.junit.jupiter.api.Order;
import org.testng.annotations.Test;

public class loginAddBasketAndDeleteBasket extends BeseTest{

    HomePage homepage;
    LoginRouterPage loginrouterpage;
    LoginPage loginpage;
    ProfilPage profilpage;
    SearchPage searchpage;
    ProductPage productpage;
    BasketPage basketpage;

    @Test
    @Order(1)
    public void logIn(){

        homepage = new HomePage(driver);
        homepage.clickProfileIcon();
        loginrouterpage = new LoginRouterPage(driver);
        loginrouterpage.clickLogInButton();
        loginpage = new LoginPage(driver);
        loginpage.inputLogIn();

    }

    @Test
    @Order(2)
    public void search(){

        profilpage = new ProfilPage(driver);
        profilpage.goToHomePage();
        homepage.goToSearchPage();
        searchpage = new SearchPage(driver);
        searchpage.search();

    }

    @Test
    @Order(3)
    public void select(){

        productpage = new ProductPage(driver);
        productpage.selectProduct();
        productpage.addBasket();
        basketpage = new BasketPage(driver);
        basketpage.deleteProduct();
        basketpage.goToHome();
//        homepage.goToProfilPage();
//        profilpage.logOut();

    }

//    @Test
//    @Order(4)
//    public void deletefourrun(){
//
//        basketpage = new BasketPage(driver);
//        basketpage.deleteProduct();
//        basketpage.goToHome();
//        homepage.goToProfilPage();
//        profilpage.logOut();
//
//    }
}
