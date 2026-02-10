
public class AreaCalculations {

    public static void main(String[] args) {
        
        double radius = 51;
        int length = 23;
        int breadth = 10;

        double areaCircle = Math.PI * radius * radius;
        int areaRectangle = length * breadth;

        System.out.printf("Area of Circle: %.2f\n", areaCircle);
        System.out.println("Area of Rectangle: " + areaRectangle);

    }
}
