package com.company;
import java.util.Scanner;

public class Cat extends Pet {

    private boolean likesCatnip;
    private boolean usesLitterBox;
    private String furType;


    public boolean isLikesCatnip() {
        return likesCatnip;
    }

    public void setLikesCatnip(boolean likesCatnip) {
        this.likesCatnip = likesCatnip;
    }

    public boolean isUsesLitterBox() {
        return usesLitterBox;
    }

    public void setUsesLitterBox(boolean usesLitterBox) {
        this.usesLitterBox = usesLitterBox;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    @Override
    protected String makeSound() {
        return super.makeSound()  + "But cats meow";
    }
}
