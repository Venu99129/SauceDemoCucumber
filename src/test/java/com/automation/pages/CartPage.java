package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    @FindBy(xpath = "//div[@class='cart_list']//div[@class='inventory_item_name']")
    List<WebElement> cartItemNames;

    public List<String> getCartItemNames(){
        return cartItemNames.stream().map(WebElement::getText).toList();
    }

}
