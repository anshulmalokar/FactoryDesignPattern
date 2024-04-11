package Pizza;

import java.util.*;
import java.io.*;

public abstract class Pizza{
    protected String name;
    protected String douge;
    protected String sauce;

    protected ArrayList<String> toppings = new ArrayList<>();

    public void preapare(){
        System.out.println("prepare");
    }

    public void bake(){
        System.out.println("bake");
    }

    public void cut(){
        System.out.println("cut");
    }

    public String getName(){
        return this.name;
    }

}