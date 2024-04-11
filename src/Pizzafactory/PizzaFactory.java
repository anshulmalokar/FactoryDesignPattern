package Pizzafactory;

import Pizza.Pizza;
import Pizza.NyStylePizza;
import Pizza.ChiChagoStypePizza;

public abstract class PizzaFactory{

    PizzaFactory(){
        
    }

    public final Pizza getPizza(String key){
        Pizza p = createPizza(key);
        p.cut();
        p.bake();
        return p;
    }
    protected abstract Pizza createPizza(String key);
}


