package com.company;

public class Pet {

    private String onerName;
    private String petName;
    private String homeAddress;
    private int age;
    private char gender;
    private boolean petSound;

    public String getOnerName() {
        return onerName;
    }

    public void setOnerName(String onerName) {
        this.onerName = onerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    protected String makeSound() {
        return "Pets make no sound";
    }
}
