import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class drink1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class drink1 extends actor
{
    /**
     * Act - do whatever the drink1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        drink1 drink1 = new drink1();
        getWorld().addObject(drink1,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
