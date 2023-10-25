import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private static final Color transparent = new Color (0,0,0,0);
    private GreenfootImage background;
    private int value;
    private static int target;
    private String prefix;
    
    public Counter()
    {
        this(new String());
    }
    
    public Counter (String prefix)
    {
        background = getImage();
        value= 0;
        target = 0;
        this.prefix = prefix;
    }
    
    /**
        * Animate the display to cont up(ur down) to the current target value.
         *
         */
    public void act()
    {
        if (value < target) {
            value++;
        }
        else if (value > target) {
            value--;
        }
    }
    
    /**
     * Add a new score to th current counter value. This will animate
     * the counter over consecutive frames until it reaches the new value.
     */
    public static void add(int score)
    {
        target += score;
    }
    
    /**
     * Return the current counter value.
     */
    public int getValue()
    {
        return target;
    }
    
    /**
     * Set a new counter value . This will not animate the counter.
     */
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
    }
    
}
