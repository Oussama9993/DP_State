import state.Avion;
import state.AvionImpl;

public class Test {
    public static void main(String[] args){
        Avion avion = new AvionImpl();
        avion.doActivity();
        System.out.println("--------------------");
        avion.sortirDuGarage();
        System.out.println("--------------------");
        avion.entreAuGarage();
        System.out.println("--------------------");
        avion.doActivity();
        System.out.println("--------------------");
        avion.decoller();
        avion.atterrir();
        avion.sortirDuGarage();

    }
}
