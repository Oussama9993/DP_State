package state;

public interface Avion {
    void sortirDuGarage(); // opération de transition d'état
    void entreAuGarage();
    void decoller();
    void atterrir();
    void doActivity();//Activité
}
