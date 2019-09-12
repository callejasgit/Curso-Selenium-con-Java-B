package org.testerCallejas.basico;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo1 {
    public static void main(String[] args){
        //intanciar un odjecto webDriver
        WebDriver driver;

        //Declarar variables
        String baseURL = "http://newtours.demoaut.com/";
        String actualResul = "";
        String expectedResul = "Welcome: Mercury Tours";

        //Indicar la localizacio del archivo chromedriver.exe en la propiedad WebDriver.chromedriver.driver
        //System.getProperty("user.dir") = C:\..\..\..\SeleniumBasico
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        //Abrrir el navegador
        driver = new ChromeDriver();

        //navegar a la pagina
        driver.get(baseURL);

        // Obtener el titulo de la pagina
        actualResul = driver.getTitle();

        //Imprimir el resultado usando el operador ternario
        System.out.println(actualResul.contentEquals(expectedResul)?"Prueba pasada!  " + actualResul :  "Prueba fallida!");

        //cerrar el navegador
        driver.close();

    }

}
