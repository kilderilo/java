package Operations;

public class Calc{
    public double width;
    public double height;
        
    public double calcArea(){
        return  width * height;
    }
    public double calcPerimeter(){
        return (2 * width) + (2 * height);
    }
    public double calcDiagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}