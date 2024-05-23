

// É uma...
public class BikeDePasseio extends Bike {

    public BikeDePasseio(){
        super("Bike de Passeio", 50);
    }

    @Override //Sobrescrita
    public int getCarga() {
        return carga;    
    }

}
