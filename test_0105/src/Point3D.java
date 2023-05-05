public class Point3D extends Point2D{
    private int x;
    private int y;
    private int z;

    public Point3D(int x, int y, int z){
        super(x,y);
        this.z=z;
    }

    public Point3D(Point2D p2, int z){
        super(p2.getX(),p2.getY());
        this.z=z;
    }

    public int getZ(){return this.z;}

    //实现平移
    public void offset(int a, int b, int c){
        this.x=a;
        this.y=b;
        this.z=c;
    }
}
