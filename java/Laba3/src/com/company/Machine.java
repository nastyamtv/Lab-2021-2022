package com.company;

public abstract class Machine implements Run {
    final double MAXSPEED=100; //константа
    final double MINSPEED=0;
    final int MINQUANTPAS=0;
    final int MAAXQUANTPAS=30;
    protected String nameTrans;
    protected double currentSpeed;

    //конструктори
    Machine()
    {
        nameTrans="Limousine";
        currentSpeed=50;
    }

    Machine(String s1, double speed) //параметрично
    {
        this.currentSpeed = speed;
        this.nameTrans = s1;
    }

    Machine(Machine obj) //копіювання
    {
        nameTrans=obj.nameTrans;
        currentSpeed=obj.currentSpeed;
    }

    void printNameTrans(){
        System.out.printf("Name: "+ nameTrans);
    }


    //методи від run
    public String getTransportName() {return this.nameTrans;}
    public double getSpeed() {return 0;}
    public double getWeight() {
        return 0;
    }
    public int getPassengerQuantity() {
        return 0;
    }
    public int getWheelQuantity() {
        return 0;
    }
}
