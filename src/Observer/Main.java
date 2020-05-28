package Observer;

/**
 * Este caso es de un monitor, este tendrá un método que lo hace cambiar de estado entre 0 = IN STOCK y 1 = NOT IN STOCK y a la vez notifica a los observers sobre el cambio
 *
 * */

public class Main {
    public static void main (String [] args){
/**
 Pueden existir tantos users (observadores) como se desee
 */
        // Creacion de los users
        User Ana = new User();
        User Marco = new User();
        User Willian = new User();
        User Esther = new User();
        User Carlos = new User();
        //Creacion del Monitor
        Monitor monitor = new Monitor();
        //Enlace entre Monitor y los Users
        monitor.enlazarObserver(Ana);
        monitor.enlazarObserver(Marco);
        monitor.enlazarObserver(Willian);
        monitor.enlazarObserver(Esther);
        monitor.enlazarObserver(Carlos);
        // Cambia el estado del monitor
        monitor.cambiarEstado();
    }


}