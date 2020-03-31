package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import driver.WebDriverManager;
import pages.HomePage;
import pages.RegisterPage;
import helpers.SetDatos;

public class RegisterTest extends WebDriverManager  {

    @Test(testName ="Test_Register", description="Caso de prueba de Registrar usuario", dataProvider="RE",  dataProviderClass =SetDatos.class)
    public void test(String nom, String ape, String tel, String mail, String direccion, String prov,String codPost,
    		String user, String pass, String pais) {
    	HomePage home = new HomePage(driver);
    	home.register();
        RegisterPage register = new RegisterPage(driver); 
        register.Register(nom, ape, tel, mail, direccion, prov, prov, codPost, user, pass, pass, pais);

    }
    
}

