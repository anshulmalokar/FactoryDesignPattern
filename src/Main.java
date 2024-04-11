import java.util.*;
import java.io.*;

import Pizza.NyStylePizza;
import Pizza.Pizza;
import Pizzafactory.NyPizzaFacory;
import Pizzafactory.PizzaFactory;

class Main{
    public static void main(String []args){
        PizzaFactory p = new NyPizzaFacory();
        Pizza p1 = p.getPizza("");
    }   
}