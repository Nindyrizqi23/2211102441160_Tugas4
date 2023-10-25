import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sandwich1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sandwich1 extends actor
{
    /**
     * Act - do whatever the sandwich1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        sandwich1 sandwich1 = new sandwich1();
        getWorld().addObject(sandwich1,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
}
