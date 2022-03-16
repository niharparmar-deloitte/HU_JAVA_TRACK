package com.javaTrack;

public class solution2 {
    public static void main(String[] args) {
        Animal am = new Animal();
        am.setName("Crocodile");
        am.setType("Reptiles");
        am.setColor("Brown");
        System.out.println("Name of the Animal is: "+am.getName());
        System.out.println("Type of the Animal is: "+am.getType());
        System.out.println("Color of the Animal is: "+am.getColor());
    }
}
class Animal{
    private String name;
    private String type;
    private String color;
    public void setName(String N){
        this.name = N;
    }
    public String getName(){
        return name;
    }
    public void setType(String n){
        type = n;
    }
    public String getType(){
        return this.type;
    }
    public void setColor(String n){
        color = n;
    }
    public String getColor(){
        return this.color;
    }


}
