package homework.homework4;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class genel_Alistirma extends BaseStaticDriver {
    public static void main(String[] args) {
        // 1
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement alerts= driver.findElement(By.id("alerts"));
        alerts.click();
        System.out.println("URL Alert Test= " + driver.getCurrentUrl());

        //2
        driver.navigate().back();
        System.out.println("URL acilis sayfası= " + driver.getCurrentUrl());

        WebElement basicAjax= driver.findElement(By.id("basicajax"));
        basicAjax.click();
        System.out.println("URL Basic Ajax=" + driver.getCurrentUrl());

        //3
        driver.navigate().back();
        WebElement findByPlayground=driver.findElement(By.xpath("//a[@id='findby']"));
        findByPlayground.click();
        WebElement prag5= driver.findElement(By.id("a31"));
        System.out.println("index5= "+prag5.getText());


        //4
        driver.navigate().back();
        WebElement search= driver.findElement(By.id("search"));
        search.click();
        WebElement baslik= driver.findElement(By.xpath("//h1[contains(text(),'Search Engine')]"));
        System.out.println("URL search= " + driver.getCurrentUrl());

        //5
        driver.navigate().back();
        WebElement calculater=driver.findElement(By.id("calculate"));
        calculater.click();
        Bekle(2);
        WebElement number1=driver.findElement(By.name("number1"));
        number1.sendKeys("20");
        WebElement number2= driver.findElement(By.name("number2"));
        number2.sendKeys("30");
        Bekle(2);
        WebElement calculateBtn=driver.findElement(By.id("calculate"));
        calculateBtn.click();
        WebElement answer= driver.findElement(By.id("answer"));
        System.out.println("cevap= " + answer.getText());
        Bekle(1);

        //6
        driver.navigate().back();
        driver.navigate().back();
        WebElement fakeAlerts= driver.findElement(By.id("fakealerttest"));
        fakeAlerts.click();
        Bekle(1);
        WebElement showAlertBox=driver.findElement(By.id("fakealert"));
        showAlertBox.click();
        WebElement ok=driver.findElement(By.id("dialog-ok"));
        ok.click();
        Bekle(2);

        //7
        WebElement modalDialog=driver.findElement(By.id("modaldialog"));
        modalDialog.click();
        Bekle(1);
        WebElement okModal=driver.findElement(By.id("dialog-ok"));
        okModal.click();

        BekleVeKapat();

        //8-9
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        WebElement normalSuccessMessageBtn=driver.findElement(By.id("normal-btn-success"));
        normalSuccessMessageBtn.click();
        Bekle(1);
        WebElement messageCloseBtn= driver.findElement(By.cssSelector("button.close"));
        messageCloseBtn.click();
        Bekle(1);

        //10
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkAll=driver.findElement(By.id("check1"));
        System.out.println(checkAll.getAttribute("value"));
        checkAll.click();
        Bekle(1);

        //11
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        // Select a day dropdown'ından rastgele bir seçenek seçiniz.
        List<WebElement> dayDropDown=driver.findElements(By.cssSelector("select[id='select-demo']>option"));
        int countWed=0;
        for (int i = 0; i < dayDropDown.size(); i++) {
            Select aDay=new Select(driver.findElement(By.id("select-demo")));
            aDay.selectByIndex(4);
            countWed++;
            if (countWed==5); break;
        }
        System.out.println(countWed+"kez wednesday seçilmiştir");

        //12
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement inputForms=driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();
        WebElement ajaxFromsubmit= driver.findElement(By.xpath("(//li[@class='tree-branch'])[2]//ul//following::li[6]//a"));
        ajaxFromsubmit.click();

        WebElement nameInput=driver.findElement(By.id("title"));
        nameInput.sendKeys("Tugba");
        WebElement comment=driver.findElement(By.id("description"));
        comment.sendKeys("Muhteşem");
        WebElement submit=driver.findElement(By.id("btn-submit"));
        submit.click();

        //13
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement listBox=driver.findElement(By.xpath("//a[text()='List Box']"));
        listBox.click();

        //  bundan sonrasını tekrar et, anlaşılmadı
        WebElement boostRapBox= driver.findElement(By.xpath("(//li[@class='tree-branch'])[7]//ul//li//a"));
        boostRapBox.click();
        WebElement boostDualList= driver.findElement(By.cssSelector("ul.list-group>li"));
        boostDualList.click();
        WebElement buttonRight= driver.findElement(By.cssSelector("button.btn.btn-default.btn-sm.move-right"));
        buttonRight.click();
        WebElement boostDualListright= driver.findElement(By.cssSelector("div.dual-list.list-right.col-md-5>div>div+ul>:nth-child(6)"));
        boostDualListright.click();
        WebElement crasHustoOdio= driver.findElement(By.cssSelector("div.dual-list.list-right.col-md-5>div>div+ul>:nth-child(1)"));
        crasHustoOdio.click();
        WebElement buttonLeft= driver.findElement(By.cssSelector("button.btn.btn-default.btn-sm.move-left"));
        buttonLeft.click();
        WebElement morbiLeoRisus= driver.findElement(By.cssSelector("div.dual-list.list-right.col-md-5>div>div+ul>:nth-child(2)"));
        morbiLeoRisus.click();
        buttonLeft.click();
        List<WebElement> leftBox=driver.findElements(By.cssSelector("div.dual-list.list-left.col-md-5>div>div+ul>li"));
        for (WebElement e:leftBox){
            System.out.println(e.getText());
        }
        System.out.println("_______________________________");
        List<WebElement> rightBox=driver.findElements(By.cssSelector("div.dual-list.list-right.col-md-5>div>div+ul>li"));
        for (WebElement e:rightBox){
            System.out.println(e.getText());
        }

        //14
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement cookies= driver.findElement(By.cssSelector("a.at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"));
        Bekle(1);
        cookies.click();
        WebElement message=driver.findElement(By.xpath("//input[@type='text']"));
        message.sendKeys("Message");
        WebElement showMessageBtn= driver.findElement(By.xpath("//button[@onclick='showInput();']"));
        showMessageBtn.click();
        WebElement messageDisplay=driver.findElement(By.cssSelector("span#display"));
        System.out.println(messageDisplay.getText());

        //15
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement cookies15= driver.findElement(By.cssSelector("a.at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"));
        Bekle(1);
        cookies15.click();
        WebElement enterA= driver.findElement(By.cssSelector("input#sum1"));
        enterA.sendKeys("15");
        WebElement enterB= driver.findElement(By.cssSelector("input#sum2"));
        enterB.sendKeys("20");
        WebElement getTotal=driver.findElement(By.xpath("//button[@onclick='return total()']"));
        getTotal.click();
        WebElement total=driver.findElement(By.cssSelector("span#displayvalue"));
        System.out.println(total.getText());

        //16
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement inputForms16=driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms16.click();
        WebElement radioBtnDemo=driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[2]"));
        radioBtnDemo.click();
        Bekle(1);
        WebElement getChecked=driver.findElement(By.id("buttoncheck"));
        getChecked.click();
        WebElement radioBtnNotCheck=driver.findElement(By.xpath("//p[text()='Radio button is Not checked']"));
        System.out.println(radioBtnNotCheck.getText());
        WebElement radioMaleBtn=driver.findElement(By.xpath("//input[@value='Male']"));
        radioMaleBtn.click();
        WebElement getChecked2=driver.findElement(By.id("buttoncheck"));
        getChecked2.click();
        WebElement radioMaleBtn2=driver.findElement(By.xpath("//input[@value='Female']"));
        radioMaleBtn2.click();
        WebElement radioBtnNotCheck2=driver.findElement(By.xpath("//p[@class='radiobutton']"));
        System.out.println(radioBtnNotCheck2.getText());


        //17
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement inputForms17= driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms17.click();
        WebElement radioBtn= driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[2]"));
        radioBtn.click();
        WebElement groupRadioMale=driver.findElement(By.cssSelector("(//input[@value='Male'])[2]"));
        groupRadioMale.click();
        WebElement ageGroup= driver.findElement(By.xpath("//input[@value='0 - 5']"));
        ageGroup.click();
        WebElement getValues=driver.findElement(By.xpath("//button[@onclick='getValues();']"));
        getValues.click();
        WebElement text= driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
        System.out.println(text.getText());

        //18
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        WebElement inProgr= driver.findElement(By.id("task-table-filter"));
        inProgr.sendKeys("in progress");
        List<WebElement> table=driver.findElements(By.cssSelector("table#task-table>tbody>tr"));

        for (WebElement e:table){
            System.out.println(e.getText());
        }

        //19
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        WebElement filterBtn=driver.findElement(By.cssSelector("button.btn.btn-default.btn-xs.btn-filter"));
        filterBtn.click();

        WebElement firstName= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("an");

        List<WebElement> names=driver.findElements(By.cssSelector("div.panel.panel-primary.filterable>table>tbody>tr"));

        for (WebElement e:names) {
            System.out.println(e.getText());
        }

        Bekle(2);

        firstName.clear();

        WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userName.sendKeys("ar");

        List<WebElement> nameS1=driver.findElements(By.cssSelector("div.panel.panel-primary.filterable>table>tbody>tr"));

        for (WebElement e:nameS1) {
            System.out.println(e.getText());
        }

        //20
        driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");

        WebElement attendance= driver.findElement(By.xpath("(//span[text()='Attendance'])[1]"));
        attendance.click();

        List<WebElement> contentsTopics=driver.findElements(By.cssSelector("li[class*='toclevel-1']"));
        JavascriptExecutor js20=(JavascriptExecutor) driver;
        js20.executeScript("window.scrollBy(0,500)");

        List<WebElement> hostCont=driver.findElements(By.cssSelector("td[style='text-align:left']>a"));

        for (WebElement host:hostCont) {
            System.out.println(host.getText());
        }

        //21
        driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");

        WebElement allTimeChamp=driver.findElement(By.xpath("(//span[text()='All-time table for champions'])[1]"));
        allTimeChamp.click();


        List<WebElement> teAms=driver.findElements(By.cssSelector("td[align=left]>span[style='white-space:nowrap']>a"));
        List<WebElement> particiPations=driver.findElements(By.xpath("(//table[@class='wikitable sortable jquery-tablesorter'])[3]/tbody/tr/td[3]"));

        for (int i = 0; i < teAms.size(); i++) {

            if (!teAms.get(i).getText().equals("Argentina"))continue;
            System.out.println(teAms.get(i).getText()+"  "+particiPations.get(i).getText());
        }

        BekleVeKapat();




    }
}