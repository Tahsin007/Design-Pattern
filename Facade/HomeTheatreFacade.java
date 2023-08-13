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
public class HomeTheatreFacade {
    private DvdPlayer dvd;
    private SoundSystem sound;
    private TV tv;
    
    public HomeTheatreFacade(){
        dvd = new DvdPlayer();
        sound = new SoundSystem();
        tv = new TV();
    }
    
    public void watchMovie(){
        dvd.on();
        tv.on();
        sound.on();
        sound.setVolum();
        tv.setChannel();
    }
    
}
