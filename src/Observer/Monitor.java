package Observer;

import java.util.ArrayList;

public class Monitor implements Observable{
    // Se crea un arraylist con los observadores
    private ArrayList<Observer> observadores;
    public int estado;

    public Monitor(){
        estado = 1;
        observadores = new ArrayList<Observer>();
    }
    // Este evento llama a notificar
    public void cambiarEstado(){
        notificar();

    }
    // Añade al observador a la lista de observadores del Mnoitor
    public void enlazarObserver (Observer o) {observadores.add(o);};{
    // Cambia el estado del monitor y envía el mensaje a todos los observers
    }
    @Override
    public void notificar() {
        int nuevo = this.setEstado(0);
        int c = this.getEstado();
        System.out.println(c);
        for(Observer o:observadores){o.update(nuevo);}

    }
    //Cambia el estado del monitor
    //1=NOT IN STOCK
    //0=IN STOCK
    public int setEstado(int x){
        this.estado = x;
        return x;
    }
    //Retorna el valor del estado
    public int getEstado(){
        return this.estado;
    }
}