package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(css = ".product_sort_container")
    WebElement filterDropDown;

    @FindBy(css =".shopping_cart_link")
    WebElement cartIcon;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutLink;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuBtn;

    @FindBy(className = "shopping_cart_badge")
    WebElement cartBadge;

    @FindBy(xpath = "//*[@class='btn btn_secondary btn_small btn_inventory ']/../..//a/div")
    List<WebElement> itemNameList;


    public void clickOnBurgerMenu(){
        menuBtn.click();
    }

    public void clickLogout(){
        logoutLink.click();
    }

    public void clickOnCart(){
        cartIcon.click();
    }

    public boolean verifyCartBadge(){
        return cartBadge.isDisplayed();
    }

    public String getBadgeValue(){
        return cartBadge.getText();
    }

    public void adToCart(String cartItemName){
        String cartListButton = "//div[@class='inventory_item_description']//div[contains(@class,'inventory_item_name') and text() = '%s']/../../following-sibling::div//button";

        driver.findElement(By.xpath(String.format(cartListButton, cartItemName))).click();
    }

    public boolean verifyIcons(){
        return  filterDropDown.isDisplayed()&& cartIcon.isDisplayed();
    }

    public List<String> getAddCartItemNames(){
        List<String> tempnames = itemNameList.stream().map(WebElement::getText).toList();
//        tempnames.add("abc");
        return tempnames;
    }
}
