package com.company;

class Limousine extends Machine {
    int weight;
    int passengersCount;
    int means;

    Limousine(String nameTrans, double currentSpeed, int weight, int passengerCount, int means) {
        super(nameTrans, currentSpeed);
        this.weight = weight;
    }

    public String getTransportName() {
        return this.getTransportName();
    }

    public double getSpeed() {
        return this.getSpeed();
    }

    public double getWeight() {
        return this.getWeight();
    }

    public int getPassengerQuantity(){
        return this.getPassengerQuantity();
    }

    public int getWheelQuantity(){
        return this.getWheelQuantity();

    }
}

class armoredLim extends Limousine{
        String armor;
        armoredLim(String nameTrans, double currentSpeed,int weight, int passengerCount, int means){
            super(nameTrans, currentSpeed,weight,passengerCount,means);
            this.armor=armor;
        }

class doorLim extends Limousine{
    int doorCount;
    doorLim(String nameTrans, double currentSpeed,int weight, int passengerCount, int means){
        super(nameTrans, currentSpeed,weight,passengerCount,means);
        this.doorCount=doorCount;
    }
}

}
