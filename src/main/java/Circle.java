public class Circle extends Figure{

    private int radius ;
    
    public Circle(String name, int yaricap) {
        super(name);
        this.radius = yaricap;
    }

    @Override
    void calculateArea() {
        System.out.println(getName() + " area : "+(Math.PI * radius *radius) );
        
    }
    
    
}
