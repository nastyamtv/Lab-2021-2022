package com.company;

abstract class Machine implements Run {
    final double maxSpeed=100; //константа
    final double minSpeed=0;
    final int minQuantPas=0;
    final int maxQuantPas=30;
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
    public String getTransportName() {
        return "Limousine" +
                "";
    }
    public double getSpeed() {
        return 0;
    }
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
