

// É uma...
public class BikeDeTrilha extends Bike {

    public BikeDeTrilha(){
        super("Bike de Trilha", 80);
        //setTipo("Bike de Trilha");
        //setCarga(80);
        
    }

    @Override //Sobrescrita
    public int getCarga() {
        //return super.getCarga();    
        return carga;
    }

}
