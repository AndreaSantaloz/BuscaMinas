package Model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private static List<Cell> Board;
    private Board(){
        Board = new ArrayList<>();
    }

    //reglas del juego
    private static void createBoard(){
        Board.add(new Cell( 0,false));
    }
}
