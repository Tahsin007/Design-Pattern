/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.Facade;

/**
 *
 * @author TANIM
 */
public class DvdPlayer {
    public void on(){
        System.out.println("DVD player is on");
    }
    
    public void off(){
        System.out.println("DVD player is off");
    }
    
    public void start(){
        System.out.println("DVD player is started");
    }
    
    public void pause(){
        System.out.println("DVD player is paused");
    }
    
}
