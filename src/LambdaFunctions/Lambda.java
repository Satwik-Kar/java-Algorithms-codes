package LambdaFunctions;
interface Shape{
    double calculateArea();
}

public class Lambda {


    public static void main(String[] args) {
        Shape square = ()->{
            int side = 4;

            return 4 * side;
        };
        Shape circle = ()->{
            double r = 5.5;
            return Math.PI * r*r;

        };


        System.out.println(square.calculateArea());
        System.out.println(circle.calculateArea());


    }
}
