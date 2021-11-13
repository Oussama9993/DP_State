package state;

public class AvionImpl implements Avion {
    private State state;
    public AvionImpl(){
        state = new EtatEnpiste();
    }
    @Override
    public void sortirDuGarage() {
        state.executesortirDuGarage();
    }

    @Override
    public void entreAuGarage() {
        state.executeentreAuGarage();

    }

    @Override
    public void decoller() {
        state.executedecoller();

    }

    @Override
    public void atterrir() {
        state.executeatterrir();

    }

    @Override
    public void doActivity() {
        state.executedoActivity();

    }
    abstract class State{
        abstract void executesortirDuGarage(); // opération de transition d'état
        abstract void executeentreAuGarage();
        abstract void executedecoller();
        abstract void executeatterrir();
        abstract void executedoActivity();//Activité
    }
    class EtatEnpiste extends State{


        @Override
        void executesortirDuGarage() {
            System.out.println("Impossible de sotir du garge vu que vous êtes déjà en piste");

        }

        @Override
        void executeentreAuGarage() {
            System.out.println("En piste vers en Garage");
            state=new EtatAuGarage();

        }

        @Override
        void executedecoller() {
            System.out.println("En piste vers décollage");
            state=new EtatEnpiste();

        }

        @Override
        void executeatterrir() {
            System.out.println("Impossible je suis déja ne piste");

        }

        @Override
        void executedoActivity() {
            System.out.println("Activité de l'état en piste");

        }
    }
    class EtatAuGarage extends State{

        @Override
        void executesortirDuGarage() {
            System.out.println("Du garage vers la piste");
            state=new EtatEnpiste();

        }

        @Override
        void executeentreAuGarage() {
            System.out.println("Impossible vous êtes déja au garage");

        }

        @Override
        void executedecoller() {
            System.out.println("Impossible il faut d'abord être sur la piste");

        }

        @Override
        void executeatterrir() {
            System.out.println("Impossible il faut d'abord être en air pour faire cela");

        }

        @Override
        void executedoActivity() {
            System.out.println("Activité en au garage....");

        }
    }
    class EtatEnAir extends State{

        @Override
        void executesortirDuGarage() {
            System.out.println("Impossible vous êtes en air il faur d'abord atterrir");

        }

        @Override
        void executeentreAuGarage() {
            System.out.println("Impossible vous êtes en air il faur d'abord atterrir");

        }

        @Override
        void executedecoller() {
            System.out.println("Impossible vous êtes  déjà en air ");

        }

        @Override
        void executeatterrir() {
            System.out.println("De l'état en air vers la piste");
            state=new EtatEnpiste();

        }

        @Override
        void executedoActivity() {
            System.out.println("Activité en air....");

        }
    }
}
