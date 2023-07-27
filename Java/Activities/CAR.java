package activities;

public class CAR {
    String Color;
    String transmission;
    int make;
    int doors;
    int tyre;
     public void Car() {
        this.tyre = 4;
        this.doors = 4;

    }
    public void Car(int make, String transmission,String color)
    {
        this.make=make;
        this.transmission=transmission;
        this.Color=color;
        this.tyre = 4;
        this.doors = 4;

    }
    public void displaychar(){
        System.out.println("color of car "+ Color);
        System.out.println("Manufature of the car "+make);
        System.out.println("transmission type "+transmission);
    }
    public void accerlate()
    {
        System.out.println("The car is moving");
    }
    public void brake()
    {
        System.out.println("The car is Brake");
    }
}


