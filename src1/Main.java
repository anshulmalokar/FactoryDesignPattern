package src1;
import java.time.DayOfWeek;
import java.util.*;


class Main{
    public static void main(String[] args){
        Beer b = BeerFactory.getBeer();
        b.brewBeer();
    }
}

class BeerFactory{
    public static Beer getBeer(){
        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        Beer myBeer = null;

        if(dayOfWeek == 1){
            myBeer = new StoutBeer();
        }else if(dayOfWeek == 2){
            myBeer = new IPABBeer();
        }

        return myBeer;

    }
}

abstract class Beer{
  public abstract void malting();
  public abstract void steeping();
  public abstract void boiling();
  public abstract void fermentation();
  public abstract void bottling();

  public void brewBeer(){
    malting();
    steeping();
    boiling();
    fermentation();
    boiling();
  }

}

class IPABBeer extends Beer{

    @Override
    public void malting() {
        // TODO Auto-generated method stub
        System.out.println("Malting with IPABeer");
    }

    @Override
    public void steeping() {
        // TODO Auto-generated method stub
        System.out.println("Steeping with IPABeer");
    }

    @Override
    public void boiling() {
        // TODO Auto-generated method stub
        System.out.println("Boiling with IPABeer");
    }

    @Override
    public void fermentation() {
        // TODO Auto-generated method stub
        System.out.println("Fermentation with IPABeer");
    }

    @Override
    public void bottling() {
        // TODO Auto-generated method stub
        System.out.println("Bottling with IPABeer");
    }

}

class StoutBeer extends Beer{

    @Override
    public void malting() {
        // TODO Auto-generated method stub
        System.out.println("Malting with StoutBeer");
    }

    @Override
    public void steeping() {
        // TODO Auto-generated method stub
        System.out.println("Steeping with StoutBeer");
    }

    @Override
    public void boiling() {
        // TODO Auto-generated method stub
        System.out.println("Boiling with StoutBeer");
    }

    @Override
    public void fermentation() {
        // TODO Auto-generated method stub
        System.out.println("Fermenting with stout beer");
    }

    @Override
    public void bottling() {
        // TODO Auto-generated method stub
        System.out.println("Bottling with stout beer");
    }

}