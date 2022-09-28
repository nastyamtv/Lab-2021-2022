package com.company;

public class Limousine extends Machine {
    int weight;
    int passengersCount;
    int means;

    Limousine(String nameTrans, double currentSpeed, int weight, int passengerCount, int means) {
        super(nameTrans, currentSpeed);
        this.weight = weight;
    }

    public String getTransportName() {
        return this.nameTrans;
    }

    public double getSpeed() {
        return this.currentSpeed;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getPassengerQuantity(){
        return this.passengersCount;
    }

    public int getWheelQuantity(){
        return this.means;

    }
}

class armoredLim extends Limousine {
    String armor;

    armoredLim(String nameTrans, double currentSpeed, int weight, int passengerCount, int means, String armor) {
        super(nameTrans, currentSpeed, weight, passengerCount, means);
        this.armor = armor;
    }
}
    class doorLim extends Limousine{
        int doorCount;
        doorLim(String nameTrans, double currentSpeed,int weight, int passengerCount, int means, int doorCount){
            super(nameTrans, currentSpeed,weight,passengerCount,means);
            this.doorCount=doorCount;
        }
    }

