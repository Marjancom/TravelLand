package travelland;

public class Car {

    private String model;
    private int maxSpeed;
    private double weight;
    private String licence;
    private double mileage;
    private int currentFuel;
    private int maxFuel;
    private int consumption;
    public int numOfPassangers;
    private int numOfSeats;
    
    
    public Car() {

        this.model = "demo";
        this.maxSpeed = 120;
        this.weight = 1000;
        this.licence = "testingDrive";
        this.mileage = 0;
        this.currentFuel = 20;
        this.maxFuel = 50;
        this.consumption = 1;

    }

    public Car(String model, int maxSpeed, int weight, String licence, double mileage, int currnetFuel, int maxFuel, int consumption) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.licence = licence;
        this.mileage = mileage;
        this.currentFuel = currnetFuel;
        this.maxFuel = maxFuel;
        this.consumption = consumption;
        System.out.println("");
    }

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void GetFields() {

        System.out.println("Model is " + this.model);
        System.out.println("Max speed is " + this.maxSpeed);
        System.out.println("Wight is: " + this.weight);
        System.out.println("Licence is: " + this.licence);
        System.out.println("Mileage is: " + this.mileage);
        System.out.println("Currentfuel: is " + this.currentFuel);
        System.out.println("Max fuel is: " + this.maxFuel);
        System.out.println("Cosumption is: " + this.consumption);

    }
    public Car (int numOfPassangers, int numOfSeats)
    {
        if (numOfPassangers<=numOfSeats)
        {
                this.numOfPassangers=numOfPassangers;
                this.numOfSeats=numOfSeats;
                System.out.println(String.format("Ovo je autobus sa %d putnika i %d sedista! Zelimo ugodnu voznju !!!!", this.numOfPassangers,this.numOfSeats) );
        }
        else {
        
        }
    
    
    }
    public void GetPassangersIn (int numOfPassangers)
    {
        System.out.println(String.format ("Pokusalo je da udje %d putnika",numOfPassangers));
        int numOfFreeSeats = this.numOfSeats-this.numOfPassangers;
        
        if (numOfPassangers<=numOfFreeSeats)
        {
            this.numOfPassangers+=numOfPassangers;
            System.out.println(String.format("Uslo je %d putnika", numOfPassangers));
            System.out.println(String.format("Ostalo je %d slobodnih mesta, a trenutni broj putnika je %d",(this.numOfSeats-this.numOfPassangers),this.numOfPassangers));
        }
        else
        {
            System.out.println(String.format("U autobusu nema dovoljno mesta, ima %d slobodnih mesta", numOfFreeSeats));
        }
    
    }
    public void PassangersOut(int numOfPassangersOut)
    {
        System.out.println(String.format("Pokusalo je da izadje %d putnika", numOfPassangersOut));
        if (numOfPassangersOut<=this.numOfPassangers)
        {
            this.numOfPassangers-=numOfPassangersOut;
            System.out.println(String.format("%d putnika je napustilo autobus",numOfPassangersOut));
            System.out.println(String.format("Trenutan broj slobodnih mesta je %d, a trenutni broj putnika je %d", (this.numOfSeats-this.numOfPassangers),this.numOfPassangers));
        }
        else
        {
        
            System.out.println(String.format("Toliko putnika ne moze napustiti autobus, moze ga napustiti maksimalno %d", this.numOfPassangers));
        }
    }

}
