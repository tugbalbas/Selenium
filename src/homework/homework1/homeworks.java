package homework.homework1;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class homeworks extends BaseStaticDriver {
    public static void main(String[] args) {
//        Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
//        buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.


//        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
//
//        List<WebElement> capitals=driver.findElements(By.cssSelector("div[id='answerDiv']>div"));
//        List<WebElement> countries=driver.findElements(By.cssSelector("div[class='destinationBox']"));
//
//        for (WebElement b:capitals ) {
//            for (WebElement u:countries) {
//                Actions aksiyonlar = new Actions(driver);
//                Action aksiyon=aksiyonlar.clickAndHold(b).moveToElement(u).release(u).build();
//                aksiyon.perform();
//                Bekle(1);
//                if(b.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) break;
//            }
//        }

//
//        Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
//        buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.

//        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
//        Actions aksiyonlar = new Actions(driver);
//
//        List<WebElement> ogr=driver.findElements(By.cssSelector("ul[id='allItems']>li"));
//        List<WebElement> teams=driver.findElements(By.cssSelector("div[id='dhtmlgoodies_mainContainer']>div"));
//
//        for (WebElement o:ogr){
//            for (WebElement t:teams){
//
//                Action aksiyon=aksiyonlar.clickAndHold(o).moveToElement(t).release(t).build();
//                aksiyon.perform();
//            }
//        }


//        ayın sorusu
//        Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
//        buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        List<WebElement> cities = driver.findElements(By.cssSelector("ul[id='allItems']>li"));
        List<WebElement> contries = driver.findElements(By.cssSelector("div[id='dhtmlgoodies_mainContainer']>div"));
        Actions aksiyonlar3 = new Actions(driver);
        for (WebElement s : cities) {
            for (WebElement u : contries) {
                Action aksiyon3 = aksiyonlar3.clickAndHold(s).moveToElement(u).release(u).build();
                aksiyon3.perform();
                Bekle(2);
                if (s.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) break;

            }Bekle(1);
            if (s.getCssValue("background-color").equals("rgba(255, 0, 0, 1)")) {
                Action aksiyon = aksiyonlar3.clickAndHold(s).moveToElement(driver.findElement(By.cssSelector("ul[id='allItems']>li")))
                        .release(driver.findElement(By.cssSelector("ul[id='allItems']>li"))).build();
                aksiyon.perform();
            }

        }

        BekleVeKapat();
    }
}


