
import java.util.Scanner;

public class GeometricFigureCalculation {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String operations = "operations... \n"
                +"1. Square area calculation\n"
                +"2. Triangle area calculation\n"
                +"3. Circler area calculation\n"
                +"Exit : q ";
        
        while(true){
            System.out.println(operations);
            System.out.print("which shape's area do you want to calculate ? :");
            String figure_type = scanner.nextLine();
            Figure figure =null;
            
            if(figure_type.equals("q")){
                System.out.println("exiting the program");
                break;
            }
            else if(figure_type.equals("1")){
                System.out.print("edge of the square : ");
                int edge = scanner.nextInt();
                scanner.nextLine();
                
                figure = new Square("Square", edge);
                figure.calculateArea();
            }
            else if(figure_type.equals("2")){
                System.out.print("edge 1 : ");
                int edge1 = scanner.nextInt();
                System.out.print("edge 2 : ");
                int edge2 = scanner.nextInt();
                System.out.print("edge 3 : ");
                int edge3 = scanner.nextInt();
                scanner.nextLine();
                
                figure = new Triangle("Triangle 1", edge1, edge2, edge3);
                figure.calculateArea();
                
            }
            else if(figure_type.equals("3")){
                System.out.print("Enter the radius of the circle : ");
                int radius = scanner.nextInt();
                scanner.nextLine();
                
                figure = new Circle("Circle", radius);
                figure.calculateArea();
            }
            else{
                System.out.println("invalid operation...");
            }
        }
    }
}
