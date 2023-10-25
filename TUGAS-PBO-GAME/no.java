import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class no extends Actor
{
    /**
     * Act - do whatever the no wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    abstract void cetakbaru();
    abstract void maju();
    
    void dimakan(){
        cetakbaru();
        getWorld().removeObject(this);
    }
    
    public void act()
    {
        maju();
        if(getY()>=499){
            setLocation(Greenfoot.getRandomNumber(300),0);
        }
        if (isTouching(kodok.class)){
            Counter2.add(-1);
            dimakan();
        }
    }
}
