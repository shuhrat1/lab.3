package movable;

public class MovableCircle extends MovablePoint implements Movable
{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.radius=radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public String toString()
    {
        return "\nradius: "+this.radius+"\ncenter: "+this.center;
    }
    @Override
    public void MoveUp()
    {
        center.y += center.ySpeed;
    }
    @Override
    public void MoveDown()
    {
        center.y -= center.ySpeed;
    }
    @Override
    public void MoveLeft()
    {
        center.x -= center.xSpeed;
    }
    @Override
    public void MoveRight()
    {
        center.x += center.xSpeed;
    }
}