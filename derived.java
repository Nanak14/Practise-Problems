package org.example;

class Animal{
    String Name;
    String Colour;

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    void Animal(String Name, String colour){
        this.Colour = Colour;
        this.Name = Name;
    }
}
public class derived extends Animal{

    Animal Lion = new Animal();

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setColour(String colour) {
        super.setColour(colour);
    }

    public void setLion(Animal lion) {
        Lion = lion;
    }

}
