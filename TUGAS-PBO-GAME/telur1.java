import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class telur1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class telur1 extends actor
{
    /**
     * Act - do whatever the telur1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        telur1 telur1 = new telur1();
        getWorld().addObject(telur1,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
}
