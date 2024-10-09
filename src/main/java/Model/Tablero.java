package Model;

import Model.Cell;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    private static List<Cell> tablero;
    private Tablero(){
        tablero = new ArrayList<>();
    }

    //reglas del juego
    private static void createTablero(){
        tablero.add(new Cell( 0,false));
    }
}
