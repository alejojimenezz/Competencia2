package LaberintoG;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

public class Escenario {

    private Robot robot;
    private Wall muro[];
    private Thing meta[];

    public Escenario(City ciudad) {
        
    }

    public void laberinto(City ciudad) {
        this.meta = new Thing[27];
        this.meta[0]= new Thing(ciudad,0,2);
        this.meta[1]= new Thing(ciudad,0,6);
        this.meta[2]= new Thing(ciudad,0,13);
        this.meta[3]= new Thing(ciudad,1,12);
        this.meta[4]= new Thing(ciudad,1,7);
        this.meta[5]= new Thing(ciudad,2,4);
        this.meta[6]= new Thing(ciudad,2,10);
        this.meta[7]= new Thing(ciudad,3,8);
        this.meta[8]= new Thing(ciudad,3,13);
        this.meta[9]= new Thing(ciudad,5,2);
        this.meta[10]= new Thing(ciudad,5,5);
        this.meta[11]= new Thing(ciudad,5,11);
        this.meta[12]= new Thing(ciudad,6,4);
        this.meta[13]= new Thing(ciudad,6,12);
        this.meta[14]= new Thing(ciudad,7,2);
        this.meta[15]= new Thing(ciudad,7,9);
        this.meta[16]= new Thing(ciudad,8,3);
        this.meta[17]= new Thing(ciudad,8,6);
        this.meta[18]= new Thing(ciudad,8,12);
        this.meta[19]= new Thing(ciudad,9,5);
        this.meta[20]= new Thing(ciudad,9,9);
        this.meta[21]= new Thing(ciudad,9,14);
        this.meta[22]= new Thing(ciudad,10,2);
        this.meta[23]= new Thing(ciudad,10,7);
        this.meta[24]= new Thing(ciudad,10,13);
        this.meta[25]= new Thing(ciudad,11,5);
        this.meta[26]= new Thing(ciudad,11,14);
        this.muro = new Wall[50];
        this.muro[0] = new Wall(ciudad, 6, 1, Direction.NORTH);
        this.muro[1] = new Wall(ciudad, 6, 1, Direction.EAST);
        this.muro[2] = new Wall(ciudad, 6, 1, Direction.SOUTH);
        this.muro[2] = new Wall(ciudad, 6, 1, Direction.WEST);
        this.muro[3] = new Wall(ciudad, 6, 2, Direction.NORTH);
        this.muro[4] = new Wall(ciudad, 6, 2, Direction.EAST);
        this.muro[5] = new Wall(ciudad, 6, 2, Direction.SOUTH);

        this.muro[6] = new Wall(ciudad, 6, 3, Direction.NORTH);
        this.muro[7] = new Wall(ciudad, 6, 3, Direction.SOUTH);
        this.muro[8] = new Wall(ciudad, 6, 4, Direction.NORTH);
        this.muro[9] = new Wall(ciudad, 6, 4, Direction.SOUTH);
        this.muro[10] = new Wall(ciudad, 6, 5, Direction.NORTH);
        this.muro[11] = new Wall(ciudad, 6, 6, Direction.SOUTH);
        this.muro[12] = new Wall(ciudad, 6, 7, Direction.NORTH);
        this.muro[13] = new Wall(ciudad, 6, 7, Direction.SOUTH);
        this.muro[14] = new Wall(ciudad, 6, 8, Direction.NORTH);
        this.muro[15] = new Wall(ciudad, 6, 8, Direction.SOUTH);
        this.muro[16] = new Wall(ciudad, 6, 9, Direction.NORTH);
        this.muro[17] = new Wall(ciudad, 6, 9, Direction.SOUTH);

        this.muro[18] = new Wall(ciudad, 6, 10, Direction.NORTH);
        this.muro[19] = new Wall(ciudad, 6, 10, Direction.SOUTH);
        this.muro[20] = new Wall(ciudad, 6, 11, Direction.NORTH);
        this.muro[21] = new Wall(ciudad, 6, 11, Direction.SOUTH);
        this.muro[22] = new Wall(ciudad, 6, 12, Direction.NORTH);
        this.muro[23] = new Wall(ciudad, 6, 12, Direction.SOUTH);
        this.muro[24] = new Wall(ciudad, 6, 12, Direction.EAST);
        this.muro[25] = new Wall(ciudad, 6, 13, Direction.NORTH);
        this.muro[26] = new Wall(ciudad, 6, 13, Direction.SOUTH);
        this.muro[27] = new Wall(ciudad, 6, 13, Direction.EAST);
        this.muro[28] = new Wall(ciudad, 6, 14, Direction.NORTH);
        this.muro[29] = new Wall(ciudad, 6, 14, Direction.SOUTH);
        this.muro[30] = new Wall(ciudad, 6, 14, Direction.EAST);
        this.muro[31] = new Wall(ciudad, 6, 15, Direction.NORTH);
        this.muro[32] = new Wall(ciudad, 6, 15, Direction.SOUTH);
        this.muro[33] = new Wall(ciudad, 6, 15, Direction.EAST);

        this.muro[34] = new Wall(ciudad, 5, 1, Direction.NORTH);

        this.muro[36] = new Wall(ciudad, 5, 1, Direction.EAST);
        this.muro[37] = new Wall(ciudad, 5, 1, Direction.WEST);
        this.muro[38] = new Wall(ciudad, 5, 2, Direction.NORTH);

        this.muro[40] = new Wall(ciudad, 5, 3, Direction.NORTH);

        this.muro[42] = new Wall(ciudad, 5, 4, Direction.NORTH);
        this.muro[43] = new Wall(ciudad, 5, 5, Direction.NORTH);
        this.muro[44] = new Wall(ciudad, 5, 6, Direction.NORTH);
        this.muro[45] = new Wall(ciudad, 5, 7, Direction.NORTH);
        this.muro[46] = new Wall(ciudad, 5, 8, Direction.NORTH);
        this.muro[47] = new Wall(ciudad, 5, 9, Direction.NORTH);
        this.muro[48] = new Wall(ciudad, 5, 10, Direction.NORTH);

        this.muro[35] = new Wall(ciudad, 5, 11, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 5, 12, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 5, 12, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 5, 13, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 5, 13, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 5, 14, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 5, 14, Direction.EAST);

        this.muro[35] = new Wall(ciudad, 5, 15, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 5, 15, Direction.EAST);

        this.muro[35] = new Wall(ciudad, 4, 1, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 1, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 4, 1, Direction.WEST);
        this.muro[35] = new Wall(ciudad, 4, 2, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 2, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 4, 3, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 3, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 4, 4, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 5, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 6, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 7, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 9, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 10, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 11, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 12, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 12, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 4, 13, Direction.NORTH);

        this.muro[35] = new Wall(ciudad, 4, 14, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 14, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 4, 15, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 4, 15, Direction.EAST);

        this.muro[35] = new Wall(ciudad, 3, 1, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 1, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 3, 1, Direction.WEST);
        this.muro[35] = new Wall(ciudad, 3, 2, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 2, Direction.WEST);
        this.muro[35] = new Wall(ciudad, 3, 3, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 3, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 3, 4, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 4, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 3, 5, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 6, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 7, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 8, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 10, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 11, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 12, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 13, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 13, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 3, 14, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 14, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 3, 15, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 3, 15, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 2, 1, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 1, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 2, 1, Direction.WEST);
        this.muro[35] = new Wall(ciudad, 2, 2, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 2, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 2, 3, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 3, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 2, 4, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 6, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 7, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 8, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 9, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 10, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 11, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 12, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 12, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 2, 13, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 13, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 2, 14, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 14, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 2, 15, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 2, 15, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 1, 1, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 1, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 1, 1, Direction.WEST);
        this.muro[35] = new Wall(ciudad, 1, 2, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 2, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 1, 3, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 3, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 1, 4, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 5, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 7, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 8, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 9, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 10, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 11, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 12, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 13, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 13, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 1, 14, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 14, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 1, 15, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 1, 15, Direction.EAST);

        this.muro[35] = new Wall(ciudad, 0, 1, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 1, Direction.EAST);
        this.muro[35] = new Wall(ciudad, 0, 1, Direction.WEST);
        this.muro[35] = new Wall(ciudad, 0, 2, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 3, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 4, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 5, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 6, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 7, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 8, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 9, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 10, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 11, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 12, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 13, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 14, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 15, Direction.NORTH);
        this.muro[35] = new Wall(ciudad, 0, 15, Direction.EAST);
        
        this.muro[0] = new Wall(ciudad,11,1,Direction.SOUTH);
        this.muro[1] = new Wall(ciudad,11,2,Direction.SOUTH);
        this.muro[2] = new Wall(ciudad,11,3,Direction.SOUTH);
        this.muro[3] = new Wall(ciudad,11,4,Direction.SOUTH);
        this.muro[4] = new Wall(ciudad,11,5,Direction.SOUTH);
        this.muro[5] = new Wall(ciudad,11,6,Direction.SOUTH);
        this.muro[6] = new Wall(ciudad,11,7,Direction.SOUTH);
        this.muro[7] = new Wall(ciudad,11,8,Direction.SOUTH);
        this.muro[8] = new Wall(ciudad,11,9,Direction.SOUTH);
        this.muro[9] = new Wall(ciudad,11,10,Direction.SOUTH);
        this.muro[10] = new Wall(ciudad,11,11,Direction.SOUTH);
        this.muro[11] = new Wall(ciudad,11,12,Direction.SOUTH);
        this.muro[12] = new Wall(ciudad,11,13,Direction.SOUTH);
        this.muro[13] = new Wall(ciudad,11,14,Direction.SOUTH);
        this.muro[14] = new Wall(ciudad,11,15,Direction.SOUTH);
        this.muro[0] = new Wall(ciudad,11,1,Direction.NORTH);
        this.muro[1] = new Wall(ciudad,11,2,Direction.NORTH);
        this.muro[2] = new Wall(ciudad,11,3,Direction.NORTH);
        this.muro[3] = new Wall(ciudad,11,4,Direction.NORTH);
        this.muro[4] = new Wall(ciudad,11,5,Direction.NORTH);
        this.muro[5] = new Wall(ciudad,11,5,Direction.NORTH);
        this.muro[6] = new Wall(ciudad,11,6,Direction.NORTH);
        this.muro[7] = new Wall(ciudad,11,7,Direction.NORTH);
        this.muro[8] = new Wall(ciudad,11,8,Direction.NORTH);
        this.muro[9] = new Wall(ciudad,11,9,Direction.NORTH);
        this.muro[11] = new Wall(ciudad,11,10,Direction.NORTH);
        this.muro[12] = new Wall(ciudad,11,12,Direction.NORTH);
        this.muro[13] = new Wall(ciudad,11,13,Direction.NORTH);
        this.muro[14] = new Wall(ciudad,11,14,Direction.NORTH);
        this.muro[15] = new Wall(ciudad,11,15,Direction.NORTH);
        this.muro[16] = new Wall(ciudad,11,15,Direction.WEST);
        this.muro[17] = new Wall(ciudad,11,15,Direction.EAST);
        this.muro[18] = new Wall(ciudad,11,1,Direction.WEST);
       
        this.muro[19] = new Wall(ciudad,10,1,Direction.NORTH);
        this.muro[20] = new Wall(ciudad,10,1,Direction.EAST);
        this.muro[21] = new Wall(ciudad,10,1,Direction.WEST);
        this.muro[22] = new Wall(ciudad,10,2,Direction.NORTH);
        this.muro[23] = new Wall(ciudad,10,3,Direction.NORTH);
        this.muro[24] = new Wall(ciudad,10,5,Direction.NORTH);
        this.muro[25] = new Wall(ciudad,10,6,Direction.NORTH);
        this.muro[26] = new Wall(ciudad,10,7,Direction.NORTH);
        this.muro[27] = new Wall(ciudad,10,8,Direction.NORTH);
        this.muro[28] = new Wall(ciudad,10,9,Direction.NORTH);
        this.muro[29] = new Wall(ciudad,10,10,Direction.NORTH);
        this.muro[30] = new Wall(ciudad,10,11,Direction.NORTH);
        this.muro[31] = new Wall(ciudad,10,12,Direction.NORTH);
        this.muro[32] = new Wall(ciudad,10,13,Direction.NORTH);
        this.muro[32] = new Wall(ciudad,10,13,Direction.EAST);
        this.muro[33] = new Wall(ciudad,10,14,Direction.NORTH);
        this.muro[33] = new Wall(ciudad,10,14,Direction.EAST);
        this.muro[34] = new Wall(ciudad,10,15,Direction.NORTH);
        this.muro[36] = new Wall(ciudad,10,15,Direction.EAST);
        this.muro[39] = new Wall(ciudad,9,1,Direction.WEST);
        this.muro[40] = new Wall(ciudad,9,1,Direction.NORTH);
        this.muro[42] = new Wall(ciudad,9,2,Direction.NORTH);
        this.muro[43] = new Wall(ciudad,9,2,Direction.WEST);
        this.muro[45] = new Wall(ciudad,9,3,Direction.WEST);
        this.muro[46] = new Wall(ciudad,9,3,Direction.NORTH);
        this.muro[47] = new Wall(ciudad,9,4,Direction.WEST);
        this.muro[48] = new Wall(ciudad,9,4,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,9,5,Direction.NORTH);
        this.muro[39] = new Wall(ciudad,9,6,Direction.NORTH);
        this.muro[40] = new Wall(ciudad,9,7,Direction.NORTH);
        this.muro[41] = new Wall(ciudad,9,8,Direction.NORTH);
        this.muro[42] = new Wall(ciudad,9,9,Direction.NORTH);
        this.muro[43] = new Wall(ciudad,9,11,Direction.NORTH);
        this.muro[44] = new Wall(ciudad,9,12,Direction.NORTH);
        this.muro[45] = new Wall(ciudad,9,13,Direction.NORTH);
        this.muro[46] = new Wall(ciudad,9,14,Direction.NORTH);
        this.muro[47] = new Wall(ciudad,9,15,Direction.NORTH);
        this.muro[48] = new Wall(ciudad,9,15,Direction.EAST);
        this.muro[39] = new Wall(ciudad,9,15,Direction.WEST);
        this.muro[40] = new Wall(ciudad,8,1,Direction.NORTH);
        this.muro[41] = new Wall(ciudad,8,1,Direction.WEST);
        this.muro[42] = new Wall(ciudad,8,1,Direction.EAST);
        this.muro[43] = new Wall(ciudad,8,2,Direction.NORTH);
        this.muro[44] = new Wall(ciudad,8,2,Direction.EAST);
        this.muro[45] = new Wall(ciudad,8,3,Direction.NORTH);
        this.muro[46] = new Wall(ciudad,8,4,Direction.NORTH);
        this.muro[47] = new Wall(ciudad,8,5,Direction.NORTH);
        this.muro[48] = new Wall(ciudad,8,6,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,8,8,Direction.NORTH);
        this.muro[44] = new Wall(ciudad,8,9,Direction.NORTH);
        this.muro[45] = new Wall(ciudad,8,10,Direction.NORTH);
        this.muro[46] = new Wall(ciudad,8,11,Direction.NORTH);
        this.muro[47] = new Wall(ciudad,8,12,Direction.NORTH);
        this.muro[47] = new Wall(ciudad,8,12,Direction.EAST);
        this.muro[48] = new Wall(ciudad,8,13,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,8,13,Direction.EAST);
        this.muro[44] = new Wall(ciudad,8,14,Direction.EAST);
        this.muro[45] = new Wall(ciudad,8,14,Direction.NORTH);
        this.muro[46] = new Wall(ciudad,8,15,Direction.EAST);
        this.muro[47] = new Wall(ciudad,8,15,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,1,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,1,Direction.EAST);
        this.muro[49] = new Wall(ciudad,7,1,Direction.WEST);
        this.muro[49] = new Wall(ciudad,7,2,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,3,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,4,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,6,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,7,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,8,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,9,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,10,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,11,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,12,Direction.NORTH);
        this.muro[49] = new Wall(ciudad,7,13,Direction.NORTH);
        this.muro[44] = new Wall(ciudad,7,13,Direction.EAST);
        this.muro[45] = new Wall(ciudad,7,14,Direction.NORTH);
        this.muro[46] = new Wall(ciudad,7,14,Direction.EAST);
        this.muro[47] = new Wall(ciudad,7,15,Direction.NORTH);
        this.muro[48] = new Wall(ciudad,7,15,Direction.EAST);
       

    }
}
