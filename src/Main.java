import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner userInputs = new Scanner(System.in);
        System.out.println("Enter x");
        double x = userInputs.nextDouble();

        System.out.println("Enter y");
        double y = userInputs.nextDouble();

        System.out.println("x is: " + x);
        System.out.println("y is: " + y);

        System.out.println("Area of Rectangle:"+area(x,y));

        System.out.println("Enter radius");
        double radius= userInputs.nextDouble();
        System.out.println("Area of Circle:"+area(radius));

    }


    static boolean shouldWakeUp(boolean isBarking,int time){

        if(0<time || time  >23) return false;
        if(!isBarking) return false;
        return time<8 || time>=20;
    }

    static boolean hasTeen(int x, int y , int z){
        return ((13<=x && x<=19) ||
                (13<=y && y<=19) ||
                (13<=z && z<=19));
    }

    static boolean hasTeenOptimized(int... ages){
        for(int age:ages){
            if (age>=13 && age<=19){
                return true;
            }
        }
        return false;
    }

    static boolean isCatPlaying(boolean isSummer,int temperature){
    if(isSummer){
         return temperature<=45 && temperature>25;
    }
    return temperature<35 && temperature>25;
    }

    static double area(double x, double y){
        if(x<0 || y< 0) return -1;

        return x*y;

    }

    static double area(double radius){
        if(radius<0) return -1;

        return radius*radius*Math.PI;

    }








}

