package movable;

public class MovableRectangle extends MovablePoint implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public boolean CheckSpeed()
    {
        if (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed)
            return true;
        else return false;
    }
    @Override
    public String toString()
    {
        return "\ntopLeft: "+this.topLeft+"\nbottomRight: "+this.bottomRight;
    }
    @Override
    public void MoveUp()
    {
        if (CheckSpeed())
        {
            bottomRight.y+=bottomRight.ySpeed;
            topLeft.y+=topLeft.ySpeed;
        }
    }
    @Override
    public void MoveDown()
    {
        if (CheckSpeed())
        {
            bottomRight.y-=bottomRight.ySpeed;
            topLeft.y-=topLeft.ySpeed;
        }
    }
    @Override
    public void MoveLeft()
    {
        if (CheckSpeed())
        {
            bottomRight.x-=bottomRight.xSpeed;
            topLeft.x-=topLeft.xSpeed;
        }
    }
    @Override
    public void MoveRight()
    {
        if (CheckSpeed())
        {
            bottomRight.x+=bottomRight.xSpeed;
            topLeft.x+=topLeft.xSpeed;
        }
    }
}