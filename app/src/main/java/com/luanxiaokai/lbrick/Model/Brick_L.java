package com.luanxiaokai.lbrick.Model;

import com.luanxiaokai.lbrick.Custom.LColor;
import com.luanxiaokai.lbrick.Custom.LConfig;

/**
 * Created by luanxiaokai on 16/1/7.
 */
public class Brick_L extends Brick {

    public Brick_L() {
        this.color = LColor.blue();

        int centerCol = (LConfig.colsOfBricks - 1) / 2;

        this.leftBorder = centerCol;
        this.rightBorder = centerCol + 1;

        this.brickPieces[0] = new BrickPiece(-3, centerCol);
        this.brickPieces[1] = new BrickPiece(-2, centerCol);
        this.brickPieces[2] = new BrickPiece(-1, centerCol);
        this.brickPieces[3] = new BrickPiece(-1, centerCol + 1);

        this.currentOrientation = orientation.original;
    }

    @Override
    public boolean rotateBrickWithBricks(int[][] bricks) {
        switch (this.currentOrientation) {
            case original: {
                Brick testBrick = new Brick_L();
                testBrick.leftBorder = this.leftBorder - 1;
                testBrick.rightBorder = this.rightBorder;
                testBrick.brickPieces[0] = new BrickPiece(this.brickPieces[0].getRow() + 1, this.brickPieces[0].getCol() + 1);
                testBrick.brickPieces[1] = new BrickPiece(this.brickPieces[1].getRow(), this.brickPieces[1].getCol());
                testBrick.brickPieces[2] = new BrickPiece(this.brickPieces[2].getRow() - 1, this.brickPieces[2].getCol() - 1);
                testBrick.brickPieces[3] = new BrickPiece(this.brickPieces[3].getRow(), this.brickPieces[3].getCol() - 2);

                if (brickCanRotate(testBrick, bricks)) {
                    --this.leftBorder;
                    this.brickPieces[0].setRow(this.brickPieces[0].getRow() + 1);
                    this.brickPieces[0].setCol(this.brickPieces[0].getCol() + 1);
                    this.brickPieces[2].setRow(this.brickPieces[2].getRow() - 1);
                    this.brickPieces[2].setCol(this.brickPieces[2].getCol() - 1);
                    this.brickPieces[3].setCol(this.brickPieces[3].getCol() - 2);

                    this.currentOrientation = orientation.rotate90Degree;

                    return true;
                }
            } break;

            case rotate90Degree: {
                Brick testBrick = new Brick_L();
                testBrick.leftBorder = this.leftBorder;
                testBrick.rightBorder = this.rightBorder - 1;
                testBrick.brickPieces[0] = new BrickPiece(this.brickPieces[0].getRow() + 1, this.brickPieces[0].getCol() - 1);
                testBrick.brickPieces[1] = new BrickPiece(this.brickPieces[1].getRow(), this.brickPieces[1].getCol());
                testBrick.brickPieces[2] = new BrickPiece(this.brickPieces[2].getRow() - 1, this.brickPieces[2].getCol() + 1);
                testBrick.brickPieces[3] = new BrickPiece(this.brickPieces[3].getRow() - 2, this.brickPieces[3].getCol());

                if (brickCanRotate(testBrick, bricks)) {
                    --this.rightBorder;
                    this.brickPieces[0].setRow(this.brickPieces[0].getRow() + 1);
                    this.brickPieces[0].setCol(this.brickPieces[0].getCol() - 1);
                    this.brickPieces[2].setRow(this.brickPieces[2].getRow() - 1);
                    this.brickPieces[2].setCol(this.brickPieces[2].getCol() + 1);
                    this.brickPieces[3].setRow(this.brickPieces[3].getRow() - 2);

                    this.currentOrientation = orientation.rotate180Degree;

                    return true;
                }
            } break;

            case rotate180Degree: {
                Brick testBrick = new Brick_L();
                testBrick.leftBorder = this.leftBorder;
                testBrick.rightBorder = this.rightBorder + 1;
                testBrick.brickPieces[0] = new BrickPiece(this.brickPieces[0].getRow() - 1, this.brickPieces[0].getCol() - 1);
                testBrick.brickPieces[1] = new BrickPiece(this.brickPieces[1].getRow(), this.brickPieces[1].getCol());
                testBrick.brickPieces[2] = new BrickPiece(this.brickPieces[2].getRow() + 1, this.brickPieces[2].getCol() + 1);
                testBrick.brickPieces[3] = new BrickPiece(this.brickPieces[3].getRow(), this.brickPieces[3].getCol() + 2);

                if (brickCanRotate(testBrick, bricks)) {
                    ++this.rightBorder;
                    this.brickPieces[0].setRow(this.brickPieces[0].getRow() - 1);
                    this.brickPieces[0].setCol(this.brickPieces[0].getCol() - 1);
                    this.brickPieces[2].setRow(this.brickPieces[2].getRow() + 1);
                    this.brickPieces[2].setCol(this.brickPieces[2].getCol() + 1);
                    this.brickPieces[3].setCol(this.brickPieces[3].getCol() + 2);

                    this.currentOrientation = orientation.rotate270Degree;

                    return true;
                }
            } break;

            default: {
                Brick testBrick = new Brick_L();
                testBrick.leftBorder = this.leftBorder + 1;
                testBrick.rightBorder = this.rightBorder;
                testBrick.brickPieces[0] = new BrickPiece(this.brickPieces[0].getRow() - 1, this.brickPieces[0].getCol() + 1);
                testBrick.brickPieces[1] = new BrickPiece(this.brickPieces[1].getRow(), this.brickPieces[1].getCol());
                testBrick.brickPieces[2] = new BrickPiece(this.brickPieces[2].getRow() + 1, this.brickPieces[2].getCol() - 1);
                testBrick.brickPieces[3] = new BrickPiece(this.brickPieces[3].getRow() + 2, this.brickPieces[3].getCol());

                if (brickCanRotate(testBrick, bricks)) {
                    ++this.leftBorder;
                    this.brickPieces[0].setRow(this.brickPieces[0].getRow() - 1);
                    this.brickPieces[0].setCol(this.brickPieces[0].getCol() + 1);
                    this.brickPieces[2].setRow(this.brickPieces[2].getRow() + 1);
                    this.brickPieces[2].setCol(this.brickPieces[2].getCol() - 1);
                    this.brickPieces[3].setRow(this.brickPieces[3].getRow() + 2);

                    this.currentOrientation = orientation.original;

                    return true;
                }
            } break;
        }

        return false;
    }
}
