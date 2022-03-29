package carpetcostcalculator;

public class Floor {
    double width;
    double length;

    public Floor(double width,double height){
        this.width =width < 0 ? 0 : width;
        this.length = height < 0 ? 0 : height;
    }
    public double getArea(){
        return this.width * this.length;

    }
}
