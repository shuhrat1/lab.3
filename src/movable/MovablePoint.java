package movable;

public class MovablePoint implements Movable
{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    MovablePoint() {}
    @Override
    public String toString()
    {
        return "("+x+", "+y+")\nxSpeed: "+xSpeed+"\nySpeed: "+ySpeed;
    }
    @Override
    public void MoveUp()
    {
        ySpeed++;
    }
    @Override
    public void MoveDown()
    {
        ySpeed--;
    }
    @Override
    public void MoveLeft()
    {
        xSpeed--;
    }
    @Override
    public void MoveRight()
    {
        xSpeed++;
    }
}