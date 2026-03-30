public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width){
        setHeight(height);
        setWidth(width);
    }

    public Rectangle(){}

    public void setHeight(double height){
        if(height >= 0.1 && height <= 20.0){
            this.height = height;
        }
    }
    public void setWidth(double width){
        if(width >= 0.1 && width <= 20.0){
            this.width = width;
        }
    }    

    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }

    public double getPerimeter(){
        return 2 * (getHeight() + getWidth());
    }

    public double getArea(){
        return getHeight() * getWidth();
    }

    public boolean isSquare(){
        return getHeight() == getWidth();
    }

    public static void main (String[]args ){
        Rectangle r1 = new Rectangle();

        System.out.println("Initial height: "+r1.getHeight());
        System.out.println("Initial width: "+r1.getWidth());

        r1.setHeight(5.0);
        r1.setWidth(7.0);

        System.out.println("New height: "+r1.getHeight());
        System.out.println("New width: "+r1.getWidth());
    }
}
