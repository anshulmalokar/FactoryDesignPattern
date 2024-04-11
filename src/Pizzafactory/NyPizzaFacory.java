package Pizzafactory;

import Pizza.NyStylePizza;
import Pizza.Pizza;

public class NyPizzaFacory extends PizzaFactory{

    @Override
    protected Pizza createPizza(String key) {
        // TODO Auto-generated method stub
        if(key.equals("NyPizza")){
            return new NyStylePizza();
        }else{
            return null;
        }
    }

}