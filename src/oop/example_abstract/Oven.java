package oop.example_abstract;


public class Oven extends Appliance {

        @Override
        public void start() {
            System.out.println("Start");
        }

        @Override
        public void work() {
            System.out.println("oven is working");
        }
        @Override
    public void stop(){
            System.out.println("Stop oven");
        }

}
