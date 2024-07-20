package br.com.msilva;

public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("the" + fuelSource + "engine has been started, and is alredy to utilize" + horsePower);
    }

    public void clean(){
        System.out.println("car has been cleaned, and the " + color.toLowerCase() + "color shines");
    }

    public void mechanicCheck(){
        System.out.println("CAr has been checked by the mechanmic. Everything looks good");
    }

    public void fuelCar(){
        System.out.println("Car is been filled with " + fuelSource.toLowerCase() );
    }
}
