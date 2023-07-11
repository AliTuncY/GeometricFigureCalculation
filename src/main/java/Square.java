public class Square extends Figure{
    private int edge;

    public Square(String name, int edge) {
        super(name);
        this.edge = edge;
    }

    @Override
    public void calculateArea() {
        System.out.println(getName() + " area : "+ (edge*edge));
        
    }
    
    
}
