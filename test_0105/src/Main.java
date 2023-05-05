import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;
        int y;
        int z;

        System.out.println("输入p2d1坐标:");
        Scanner sc1=new Scanner(System.in);
        x= sc1.nextInt();
        y= sc1.nextInt();
        Point2D p2d1=new Point2D(x,y);

        System.out.println("输入p2d2坐标:");
        Scanner sc2=new Scanner(System.in);
        x= sc2.nextInt();
        y= sc2.nextInt();
        Point2D p2d2=new Point2D(x,y);

        System.out.println("输入p3d1 Z坐标:");
        Scanner sc3=new Scanner(System.in);
        z=sc3.nextInt();
        Point3D p3d1=new Point3D(p2d1,z);

        System.out.println("输入p3d2 Z坐标:");
        Scanner sc4=new Scanner(System.in);
        z=sc4.nextInt();
        Point3D p3d2=new Point3D(p2d2,z);

        double d1= Math.sqrt(Math.pow(p2d1.getX()- p2d2.getX(), 2)+Math.pow(p2d1.getY()- p2d2.getY(), 2));
        double d2= Math.sqrt(Math.pow(p3d1.getX()- p3d2.getX(), 2)+Math.pow(p3d1.getY()- p3d2.getY(), 2)+Math.pow(p3d1.getZ()- p3d2.getZ(), 2));

        System.out.println("p2d1与p2d2的距离:"+d1);
        System.out.println("p3d1与p3d2的距离:"+d2);
    }
}
