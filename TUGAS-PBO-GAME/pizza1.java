import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pizza1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pizza1 extends actor
{
    /**
     * Act - do whatever the pizza1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        pizza1 pizza1 = new pizza1();
        getWorld().addObject(pizza1,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
}
