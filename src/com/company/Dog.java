package com.company;

import java.util.Scanner;

public class Dog extends Pet {

    private boolean likesWalks;
    private boolean canFetch;
    private String coatType;
    private Scanner input = new Scanner(System.in);

    public Dog() {

        System.out.println("What is your dog's name?");
        setPetName(input.nextLine());
        System.out.println("Does" + getPetName() + " like to take walks?");
        setLikesWalks(input.nextBoolean());

    }

    public boolean isLikesWalks() {
        return likesWalks;
    }

    public void setLikesWalks(boolean likesWalks) {
        this.likesWalks = likesWalks;
    }

    public boolean isCanFetch() {
        return canFetch;
    }

    public void setCanFetch(boolean canFetch) {
        this.canFetch = canFetch;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
}
