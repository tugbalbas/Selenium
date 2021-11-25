package Gun18;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Dimension;


public class _01_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().window().maximize(); // Ekranı tam boyut haline getiriyor

        Bekle(3);
        // Ekranı yeni ölçülere göre set etme
        Dimension yeniOlcu=new Dimension(400,600);
        driver.manage().window().setSize(yeniOlcu);

        Bekle(3);
        // Şu andaki ölçüleeri alma/consola yazdırma
        Dimension suAnkiOlculer=driver.manage().window().getSize();
        System.out.println("suAnkiOlculer.width = " + suAnkiOlculer.width);
        System.out.println("suAnkiOlculer.height = " + suAnkiOlculer.height);

        BekleVeKapat();


    }
}
