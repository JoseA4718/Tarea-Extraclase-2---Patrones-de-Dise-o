package Observer;

public class User implements Observer {

    public User(){}
    // Está atento a los cambios de estado del Monitor
    @Override
    public void update(int x){
        //IN STOCK
        if(x == 0){
            System.out.println("EL MONITOR ESTÁ DISPONIBLE");
        }
        //NOT IN STOCK
        if(x == 1){
            System.out.println("EL MONITOR SIGUE SIN ESTAR DISPONIBLE");
        }
    }
}

