import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cupcake1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cupcake1 extends actor
{
    /**
     * Act - do whatever the cupcake1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        cupcake1 cupcake1 = new cupcake1();
        getWorld().addObject(cupcake1,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
}
