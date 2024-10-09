package Model;

import java.util.Objects;

public class Cell {
    private int numberMinas;
    private boolean mina;

    public Cell(int numberMinas, boolean mina) {
        this.numberMinas = numberMinas;
        this.mina = mina;
    }

    public int getNumberMinas() {
        return numberMinas;
    }

    public void setNumberMinas(int numberMinas) {
        this.numberMinas = numberMinas;
    }

    public boolean isMina() {
        return mina;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return numberMinas == cell.numberMinas && mina == cell.mina;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberMinas, mina);
    }
}




