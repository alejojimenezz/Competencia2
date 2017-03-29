/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaberintoG;

import becker.robots.*;

/**
 *
 * @author Estudiante
 */
public class Recorrido {
    
    private Robot robot;
    public int contador=0;
	public int[] calle =new int[27];
	public int[] avenida =new int[27];
	public int cont=0;

    public Recorrido(City ciudad) {
       
       this.robot = new Robot(ciudad, 11, 1, Direction.EAST,0);
    }
    
public void derecha(){
    for(int j=0;j<3;j++){
        robot.turnLeft();
    }
}    

public void soloAvance(){
    while(robot.frontIsClear()==true){
        if(robot.canPickThing()==true){
			robot.pickThing();
			avenida[cont]=robot.getAvenue();
			calle[cont]=robot.getStreet();
			cont++;
		}
        robot.move();
    }
    //this.imprimir();
    if(robot.canPickThing()==true){
			robot.pickThing();
			avenida[cont]=robot.getAvenue();
			calle[cont]=robot.getStreet();
			cont++;
			contador++;
		}
    //this.imprimir();
    robot.turnLeft();
    robot.turnLeft();
}

public void Avance(int i){

    for(int j=0; j<=i; j++){
    robot.move();
    }
}

public void irIzquierda (){

    this.derecha();
    while(robot.frontIsClear()==false){
        robot.turnLeft();
        robot.move();
        this.derecha();
    }
    robot.move();
    robot.turnLeft();
    while(robot.frontIsClear()==true){
        robot.move();
    }
    robot.turnLeft();
    robot.turnLeft();
    }

public void guardarPosicion(){
		if(this.robot.canPickThing()==true){
			this.robot.pickThing();
			avenida[cont]=robot.getAvenue();
			calle[cont]=robot.getStreet();
			cont++;
			contador++;
			
		}
}

public void imprimir(){
    for (int i = 0; i < 27; i++) {
		System.out.println(avenida[i]+" "+calle[i]);
		
	}
}

}