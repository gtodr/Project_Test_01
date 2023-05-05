public class Point2D {
    private int x;
    private int y;

    public Point2D(){this.x=0; this.y=0;}

    public Point2D(int x, int y){this.x=x;this.y=y;}

    public int getX(){return x;}

    public int getY(){return y;}


    //实现平移
    public void offset(int a, int b){
        this.x=a;
        this.y=b;
    }

}
