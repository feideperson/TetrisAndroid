package com.luanxiaokai.lbrick.Model;

import com.luanxiaokai.lbrick.Custom.LColor;
import com.luanxiaokai.lbrick.Custom.LConfig;

/**
 * Created by luanxiaokai on 16/1/8.
 */
public class Brick_O extends Brick {

    public Brick_O() {
        this.color = LColor.orange();

        int centerCol = (LConfig.colsOfBricks - 1) / 2;

        this.leftBorder = centerCol;
        this.rightBorder = centerCol + 1;

        this.brickPieces[0] = new BrickPiece(-2, centerCol);
        this.brickPieces[1] = new BrickPiece(-2, centerCol + 1);
        this.brickPieces[2] = new BrickPiece(-1, centerCol);
        this.brickPieces[3] = new BrickPiece(-1, centerCol + 1);

        this.currentOrientation = orientation.original;
    }

    @Override
    public boolean rotateBrickWithBricks(int[][] bricks) {
        return false;
    }
}
