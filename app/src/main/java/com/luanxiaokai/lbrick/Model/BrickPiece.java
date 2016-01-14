package com.luanxiaokai.lbrick.Model;

/**
 * Created by luanxiaokai on 16/1/7.
 */
public class BrickPiece {

    private int row;
    private int col;

    public BrickPiece(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
