package Model;

import java.util.Objects;

public class Cell {
    private int mineNumber;
    private boolean mine;

    public Cell(int mineNumber, boolean mine) {
        this.mineNumber = mineNumber;
        this.mine = mine;
    }

    public int getmineNumber() {
        return mineNumber;
    }

    public void setmineNumber(int mineNumber) {
        this.mineNumber = mineNumber;
    }

    public boolean ismine() {
        return mine;
    }

    public void setmine(boolean mine) {
        this.mine = mine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return mineNumber == cell.mineNumber && mine == cell.mine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mineNumber, mine);
    }
}




