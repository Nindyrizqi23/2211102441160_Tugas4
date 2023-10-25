import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1);

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        kodok kodok = new kodok();
        addObject(kodok,145,303);
        sandwich1 sandwich1 = new sandwich1();
        addObject(sandwich1,241,104);
        telur1 telur1 = new telur1();
        addObject(telur1,117,148);
        pizza1 pizza1 = new pizza1();
        addObject(pizza1,40,29);
        peer1 peer1 = new peer1();
        addObject(peer1,216,206);
        drink1 drink1 = new drink1();
        addObject(drink1,44,242);
        cupcake1 cupcake1 = new cupcake1();
        addObject(cupcake1,169,34);
        no1 no1 = new no1();
        addObject(no1,6,149);
        no3 no3 = new no3();
        addObject(no3,137,202);
        Counter counter = new Counter("Score: ");
        addObject(counter,55,475);
        Counter2 counter2 = new Counter2("HP: ");
        addObject(counter2,238,474);
        counter2.setLocation(230,461);
        counter2.setLocation(247,458);
        counter.setLocation(55,475);
    }
}

