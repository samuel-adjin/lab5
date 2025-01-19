package prob3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shapes> shapesList = new ArrayList<>();
        shapesList.add(new Rectangle(10,12));
        shapesList.add(new Triangle(5,12));
        shapesList.add(new Circle(7));
        double sum = 0.0;
        for (Shapes shape : shapesList) {
            sum+=shape.computeArea();
        }
        System.out.printf("Sum of area is %.2f", sum);
    }

}
