/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;

/**
 *
 * @author Neeraj Mishra
 */
abstract class Car{
Car(){System.out.println("Car is created");}
abstract void run();
void changeGear(){System.out.println("gear changed");}
}
//Creating a Child class which inherits Abstract class
class Maruti extends Car{
void run(){
System.out.println("accelerating safely..");
} }
//Creating a Test class which calls abstract and non-abstract methods
class TestAbstraction2{
public static void main(String args[]){
Car obj = new Maruti();
obj.run();
obj.changeGear();
} }

