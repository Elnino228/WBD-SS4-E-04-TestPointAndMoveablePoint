public class TestPointAndMoveablePoint {
    public static void main(String[] args) {
        Point point=new Point();
        System.out.println(point);

        point=new Point(1.0f,1.0f);
        System.out.println(point);

        MoveablePoint moveablePoint=new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint=new MoveablePoint(1.0f,1.0f);
        System.out.println(moveablePoint);

        MoveablePoint a=moveablePoint.move();
        a.move();
        System.out.println(a);
    }
}
class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point(){
    }
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public float[] getXY(){
        float[] arr={getX(),getY()};
        return arr;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x,float y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "A point has position x is "+x
                +", y is "+y;
    }
}
class MoveablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MoveablePoint(){
    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed(){
        return xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public float[] getSpeed(){
        float[] arr={xSpeed,ySpeed};
        return arr;
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }
    public MoveablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }

    @Override
    public String toString(){
        return "A moveablePoint has xSpeed is "+xSpeed
                +", ySpeed is "+ySpeed
                +" and is subclass of "+super.toString();
    }
}