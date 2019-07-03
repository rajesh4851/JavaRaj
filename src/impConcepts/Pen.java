package impConcepts;

public class Pen {
    private String brand;
    private String color;
    private String type;
    public static int count;
//    public int length;


//    public Pen(String brand, String color, String type) {
//        this.brand = brand;
//        this.color = color;
//        this.type = type;
//    }

    public Pen(){
        System.out.println("I am in pen constructor");
        this.count++;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }


    public String toString() {
        return " Brand :"+ brand+" Color :"+color+" Type :"+ type;
    }
}
