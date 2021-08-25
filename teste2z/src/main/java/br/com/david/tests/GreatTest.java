package br.com.david.tests;

//import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import br.com.david.core.BaseTest;
import br.com.david.pages.GreatPage;

public class GreatTest extends BaseTest {
	
  GreatPage greatPage = new GreatPage();
  

  @Test
  public void comecarTeste()   {
    greatPage.acessarTelaInicial();
  
    greatPage.cadastrar();
    
    greatPage.escrever("email", "davidvrau12346568@gmail.com");
    greatPage.escrever("password", "testaut2020");
    greatPage.escrever("passwordConfirmation", "testaut2020");
    greatPage.clicarRadio("termsOfUse");
    greatPage.clicarBotao(By.xpath("//*[@id=\"signup__form\"]/button"));
    greatPage.delay(6000);
    Assert.assertEquals("Parabéns! O Organizze já está preparado para você!", greatPage.obterTexto(By.xpath("/html/body/div[2]/div/div[2]/h3")));
    greatPage.delay(6000);
    greatPage.clicarBotao(By.xpath("/html/body/div[2]/div/div[2]/a"));

  // /html/body/div[2]/div/div[2]/a  
  }
  

}