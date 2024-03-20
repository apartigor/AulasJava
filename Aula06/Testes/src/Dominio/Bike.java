package Dominio;

public class Bike {
    
    public int numeroMarcha = 1; 
    public String nomeMarca = "Adidas";

    public void trocarMarcha(int novaMarcha){
        numeroMarcha = novaMarcha;
    }

    public void trocarMarca(String novaMarca)
    {
        nomeMarca = novaMarca;
    }


    
}
