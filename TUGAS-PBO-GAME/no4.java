import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class no4 extends no
{
    /**
     * Act - do whatever the no4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        no4 no4 = new no4();
        getWorld().addObject(no4,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
