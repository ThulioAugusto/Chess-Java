package boardGame;

public class Position {
    private int row; // atributo linha
    private int column;// atributo Coluna

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    @Override
    public String toString(){  // imprimir a posição na tela
        return row +", "+ column;
    }
}
