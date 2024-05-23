package EXHERANCA;

import java.util.List;
import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {

        System.out.println();

        // Bike bikeGenerica = new Bike(10, 10);
        // bikeGenerica.setCor("Vermelha");

        // List<BikeDeCorrida> listaBikesCorrida = new ArrayList<>();
        List<Bike> listaGenBikes = new ArrayList<>();
        List<Transporte> transportes = new ArrayList<>();

        // 100km
        // BikeDeCorrida bikeDeCorrida = new BikeDeCorrida(100, 70);
        // Bike bikeDeCorrida = new BikeDeCorrida(100, 70);
        Transporte bikeDeCorrida = new BikeDeCorrida(100, 70);
        bikeDeCorrida.setCor("Verde");

        // listaBikesCorrida.add(bikeDeCorrida);
        listaGenBikes.add((Bike) bikeDeCorrida);
        transportes.add(bikeDeCorrida);

        // 40km
        // BikeDePasseio bikeDePasseio = new BikeDePasseio(40, 60);
        Bike bikeDePasseio = new BikeDePasseio(40, 60);
        bikeDePasseio.setCor("Preta");

        // listaBikesCorrida.add(bikeDePasseio);
        listaGenBikes.add((Bike) bikeDePasseio);
        transportes.add(bikeDePasseio);

        // 60km
        // BikeDeTrilha bikeDeTrilha = new BikeDeTrilha(60, 80);
        Bike bikeDeTrilha = new BikeDeTrilha(60, 80);
        bikeDeTrilha.setCor("Amarela");

        listaGenBikes.add((Bike) bikeDeTrilha);
        transportes.add(bikeDeTrilha);

        // System.out.println(bikeDeCorrida);
        // System.out.println(bikeDePasseio);
        // System.out.println(bikeDeTrilha);

        // transportes.addAll(listaGenBikes);

        // for (Bike bike : listaGenBikes) {
        // System.out.println(bike);
        // }

        for (int i = 0; i < listaGenBikes.size(); i++) {
            Bike b = listaGenBikes.get(i);
            System.out.println(b);
        }

        for (Transporte transporte : transportes) {
            System.out.println("Carga: " + transporte.getCarga());
        }

    }

}
