package com.company;

class Main {

    public static void main(String[] args) {
	// write your code here

        Limousine l1 = new Limousine("Lim1",10,10,10,10);
        System.out.printf("Name Transport: ");
        System.out.println(l1.getTransportName());
        armoredLim l2= new armoredLim("ArmLim2", 10,10,10,10,"VeryArmor");
        System.out.printf("Name Transport +armor: " + l2.getTransportName() +" "+l2.armor+"\n");
        doorLim l3= new doorLim("DoorLim3", 10,10,10,10,8);
        System.out.printf("Name Transport +doorCount: " + l3.getTransportName() +" "+l3.doorCount);
    }
}
