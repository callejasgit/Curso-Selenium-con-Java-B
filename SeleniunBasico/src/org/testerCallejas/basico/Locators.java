package org.testerCallejas.basico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args){

        WebDriver driver;
        String baseURL = "http://live.guru99.com/index.php/";
        String actualResul = "";
        String expectedResul = "$615.00";
        String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();


        //clic en el lick
        driver.findElement(By.linkText("TV")).click();


        //clic en el botón ADD TO CART
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button/span/span")).click();


       //Obtener el precio
        actualResul = driver.findElement(By.cssSelector("#shopping-cart-table>tbody>tr>td.product-cart-total>span>span")).getText();

        if (actualResul.contentEquals(expectedResul)){
            System.out.println("Prueba pasada! el resultado actual es: " + actualResul + "Es igual a " + expectedResul);
        }else {
            System.out.println("Prueba fallida! el resultado actual es: " + actualResul + "No es igual a " + expectedResul);

        }

        // cerrar el navegador
           driver.close();

   }

}

