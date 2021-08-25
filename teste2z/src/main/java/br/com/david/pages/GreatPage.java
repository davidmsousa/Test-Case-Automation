package br.com.david.pages;

import org.openqa.selenium.By;

import br.com.david.core.BasePage;
import br.com.david.core.DriverFactory;

public class GreatPage extends BasePage {
  public void acessarTelaInicial(){
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
    DriverFactory.getDriver().get("https://www.organizze.com.br/");
  }
  
  public void cadastrar(){
    clicarBotao(By.xpath("/html/body/main/header/div/div[2]/div[2]/a[2]"));
  }
  

  public void delay(long time)
  {

    try
    {
      Thread.sleep(time);
    }
    catch (InterruptedException e)
    {

      e.printStackTrace();
    }

  }
  
}