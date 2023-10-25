import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peer1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peer1 extends actor
{
    /**
     * Act - do whatever the peer1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        peer1 peer1 = new peer1();
        getWorld().addObject(peer1,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
}
