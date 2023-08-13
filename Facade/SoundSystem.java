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
public class SoundSystem {
    public void on(){
        System.out.println("Sound system is on");
    }
    public void setVolum(){
        System.out.println("Sound system's volum is set");
    }
    public void off(){
        System.out.println("Sound system is off");
    }
    
}
