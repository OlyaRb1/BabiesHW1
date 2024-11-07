package org.example.Point;

public class Point implements Movable {
    private int x;
    private int y;

    public void setX (int x) {
        this.x = x;
    }
    public void setY (int y) {
        this.y = y;
    }


    public int getX () {
        return this.x;
    }
    public int getY () {
        return this.y;
    }

    @Override
    public void moveUp() {
        int yNew = this.y + 1;
        System.out.println(this.x + ", " + yNew);
    }

    @Override
    public void moveDown() {
        int yNew = this.y - 1;
        System.out.println(this.x + ", " + yNew);

    }

    @Override
    public void moveLeft() {
        int xNew = this.x - 1;
        System.out.println(xNew + ", " + this.y);

    }

    @Override
    public void moveRight() {
        int xNew = this.x + 1;
        System.out.println(xNew + ", " + this.y);

    }
}
