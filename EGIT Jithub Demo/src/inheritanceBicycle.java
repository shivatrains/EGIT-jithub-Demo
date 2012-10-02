public class inheritanceBicycle {

public static void main(String args[]) {

//create the objects of Bicycle & mountainBike
Bicycle B = new Bicycle(10,20,30);
MountainBike m = new MountainBike(1,2,300,4);
// for Bicycle
System.out.println("value of speed of bicycle " + B.speed);
B.speedUp(7);
System.out.println("value of speed after increase " + B.speed);
System.out.println("value of speed of mountainbike " + m.speed);
m.speedUp(7);
System.out.println("value of speed after increase " + m.speed);

}

}