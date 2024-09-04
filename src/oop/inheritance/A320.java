package oop.inheritance;

public class A320 extends Flight{
@Override
    public void boarding(){
    System.out.println("3 into 3 config");
}
@Override
    public void startEngine(){
    System.out.println("sequence to start");
}
@Override
    public void fly(){
    System.out.println("Autopilot support");
}
public void altitude(){
    System.out.println("altitude 3000");
}
}
