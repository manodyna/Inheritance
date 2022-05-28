package com.logicalconstant;

//This is a class to define a red colored button.
//Instead of defining all the properties of the button again which leads to code duplication,
//we will just extend the class button
//This now means that the class RedButton simply has all the properties of the button class,
//plus some other properties
public class RedButton extends button{

//    The properties of a red button will be the same as the properties of a button
//    But now we have added a new property to this button and that is color which we have set to red
    public RedButton(String color, int radius, int height) {
        super(radius, height);
        color="red";
    }

}
