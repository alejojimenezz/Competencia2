
package LaberintoG;

import becker.robots.City;

public class main {

     public static void main(String[] args) {
     City praga= new City();
     Escenario laberintos = new Escenario(praga);   
     Recorrido k= new Recorrido(praga);
     laberintos.laberinto(praga);
     for(int i=0;i<11;i++){
     k.soloAvance();
     k.irIzquierda();
     }
     k.soloAvance();
     k.imprimir();
     }

}