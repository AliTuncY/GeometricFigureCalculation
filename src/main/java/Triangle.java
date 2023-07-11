public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    
    public Triangle(String name,int a,int b, int c){
        super(name);
        this.a= a;
        this.b= b;
        this.c= c;
        
    }
    
    @Override
    public void calculateArea() {
        double t = (a+b+c)/ 2.0;
        
        double alan = (t * (t-a)* (t-b)*(t-c));
        System.out.println(getName()+ " in alanı : "+ alan);
    }
    
    
}
